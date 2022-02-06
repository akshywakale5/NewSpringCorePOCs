package com.akshay.spcore;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MyWishMsgTestApp {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("D:\\executables\\ApplicationContext.xml");
		XmlBeanFactory b=new XmlBeanFactory(res);
		WishMsgPOJO result = b.getBean("i", WishMsgPOJO.class);
		System.out.println("Result :" + result.WishMsgGenerate());
	}

}
