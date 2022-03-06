package com.mycompany.service;

import com.mycompany.Employee.APIResponse;
import com.mycompany.Employee.EmployeePrimarySkillRequest;
import com.mycompany.employeeGrpc.employeeImplBase;
import com.mycompany.dataaccess.EmployeePrimarySkillDataAccess;

import io.grpc.stub.StreamObserver;

public class EmployeePrimarySkillGRPCService extends employeeImplBase {

	@Override
	public void getEmployeePrimarySkill(EmployeePrimarySkillRequest request,
			StreamObserver<APIResponse> responseObserver) {
		
		int id = request.getEmpId();
		
		//go to database and return primary skill for the requested ID
		String priSkill = EmployeePrimarySkillDataAccess.getEmployeePrimarySkill(id);
		
		//build response
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if(priSkill != null && !("NA").equals(priSkill))
			response.setResponseCode(0).setResponsemessage("Success").setPrimarySkill(priSkill);
		else
			response.setResponseCode(5).setResponsemessage("Failure");
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
	
	
	
	
	
	

}
