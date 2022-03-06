package com.mycompany;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mycompany.service.EmployeePrimarySkillGRPCService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class EmployeeGRPCServer {
	
	private static final Logger logger = LogManager.getLogger(EmployeeGRPCServer.class);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//create server instance
		Server server = ServerBuilder.forPort(9090).addService(new EmployeePrimarySkillGRPCService()).build();
		
		server.start();
		
		logger.info("Server has started now on port 9090");
		
		server.awaitTermination();
	}
	

}
