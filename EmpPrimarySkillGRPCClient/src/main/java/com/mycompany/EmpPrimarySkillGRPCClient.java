package com.mycompany;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mycompany.Employee.APIResponse;
import com.mycompany.Employee.EmployeePrimarySkillRequest;
import com.mycompany.employeeGrpc.employeeBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class EmpPrimarySkillGRPCClient {

	private static final Logger logger = LogManager.getLogger(EmpPrimarySkillGRPCClient.class);

	public static void main(String[] args) throws Exception{

		//setting defaults to arguments
		int empID = 0; //the employee id for which we need to check the primary skill
		String target = "localhost:9090";   // server:port on which gRPC server is running


		// Allow passing in the user and target strings as command line arguments
		if (args.length > 0) {
			if ("--help".equals(args[0])) {
				logger.error("Usage: [employee ID] [target]");
				logger.error("  employeeID - The employee ID you wish to identify primary skill for. Defaults to 0");
				logger.error("  target -     The server to connect to. Defaults to localhost:9090");
				System.exit(1);
			}

			try {
				empID = Integer.parseInt(args[0]);
			}catch (NumberFormatException e) {
				empID = 0;  //if someone does not give employee ID as first argument, reset empID to 0 
			}
		}

		if (args.length > 1) {
			target = args[1];
		}


		ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
		// stubs - generate from proto buf
		employeeBlockingStub empStub = employeeGrpc.newBlockingStub(channel);
		EmployeePrimarySkillRequest employeePrimarySkillRequest = EmployeePrimarySkillRequest.newBuilder().setEmpId(empID).build();

		try {
			if(empID > 0) {
				APIResponse apiResponse = empStub.getEmployeePrimarySkill(employeePrimarySkillRequest);
				if(apiResponse != null && apiResponse.getResponseCode()==0 && logger.isInfoEnabled())
					logger.info(String.format("Employee with id %s has primary skill as %s", empID, apiResponse.getPrimarySkill()));
				else 
					logger.info("Could not retrieve Primary skill for employee. Perhaps employee with said ID could not be found.");

			}else
				logger.error("Invalid employee ID. Please retry.");
		}catch(Exception e) {
			logger.error("Something went wrong. Probably invalid employee ID. Please retry.");
		}
		finally {
			// ManagedChannels use resources like threads and TCP connections. To prevent leaking these
			// resources the channel should be shut down when it will no longer be used. If it may be used
			// again leave it running.
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}

	}


}
