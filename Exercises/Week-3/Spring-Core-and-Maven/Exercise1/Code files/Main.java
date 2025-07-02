package com.library.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service1 = (BookService) context.getBean("bookservice");
		
		BookRepository service2 = (BookRepository) context.getBean("bookrepository");

		System.out.println(service1);
		System.out.println(service2);
		
	}

}
