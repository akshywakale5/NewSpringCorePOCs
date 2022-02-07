package com.akshay;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class WishMsgTestApp {

	public static void main(String[] args) {
		ClassPathResource fileSystemResource=new
		ClassPathResource("ApplicationContext.xml");
		//FileSystemResource fileSystemResource = new FileSystemResource("src/ApplicationContext.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(fileSystemResource);
		WishMsgGeneratePOJO wish = beanFactory.getBean("i", WishMsgGeneratePOJO.class);
		System.out.println("Result :" + wish.msgGenerate());
		System.out.println("Result :" + wish.msgGenerate());
	}

}
