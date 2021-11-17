package com.ntt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import starterCircuitBreaker.starter.Status;

@Component
@Endpoint(id = "status")
public class StatusEndpoint {

	
List<String> list = new ArrayList<>();

@Autowired
Status status;
	
	
	@ReadOperation
	public List<String> status()
	{
		return list;
	}
	
	@WriteOperation
	public void writeStatus(@Selector String writeStatus)
	{
		
		list.add(status.executeCircuit(writeStatus));
	}
	
	@DeleteOperation
	public void deleteStatus(@Selector String deleteStatus)
	{
		list.remove(deleteStatus);
	}
}
