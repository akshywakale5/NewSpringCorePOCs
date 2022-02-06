package com.akshay.score;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class WishMsgTestApp {

	public static void main(String[] args) {
		FileSystemResource fileSystemResource=new FileSystemResource("src/ApplicationContext.xml");
		XmlBeanFactory beanFactory=new XmlBeanFactory(fileSystemResource);
		WishMsgGeneratePOJO wish=beanFactory.getBean("i", WishMsgGeneratePOJO.class);
		System.out.println("Result :"+wish.msgGenerate());
	}

}
