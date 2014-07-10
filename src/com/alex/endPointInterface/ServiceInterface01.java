package com.alex.endPointInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService

public interface ServiceInterface01 {

		@WebMethod
		public int makeAdd(int a, int b);
		
		public int makeSubstract(int a, int b);
	
}
