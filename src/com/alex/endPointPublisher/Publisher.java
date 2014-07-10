
package com.alex.endPointPublisher;

import javax.xml.ws.Endpoint;
import com.alex.endPointImplementation.ServiceImplementation01;

public class Publisher {

	public static void main(String [] args){
		//end point
		Endpoint.publish("http://localhost:3030/add", new ServiceImplementation01() );
	}
	
}
