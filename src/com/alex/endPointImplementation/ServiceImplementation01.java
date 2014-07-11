package com.alex.endPointImplementation;

import javax.jws.WebService;
import com.alex.endPointInterface.*;

@WebService(endpointInterface="com.alex.endPointInterface.ServiceInterface01",
serviceName = "addService_serviceName", 
portName = "addService_portName")
public class ServiceImplementation01 implements ServiceInterface01{

	@Override
	public int makeAdd(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int makeSubstract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}




