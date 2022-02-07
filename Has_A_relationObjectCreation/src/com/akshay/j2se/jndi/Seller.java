package com.akshay.j2se.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Seller {

	public static void main(String[] args) throws NamingException {
		
		
		Buyer buyer=new Buyer();
		System.getProperties().put("buyer",Buyer.class); 
		//System.getProperties().put("java.naming.provider.url", "t3://localhost:80")
		Context ic = new InitialContext();
		ic.bind("buyer", buyer);
		buyer=(Buyer) ic.lookup("buyer");
		System.out.println("result"+buyer+"new");
	}
}
