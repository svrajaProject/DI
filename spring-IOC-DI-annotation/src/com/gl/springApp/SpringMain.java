package com.gl.springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.gl.spring.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
		
		SportsCoach spCoach = context.getBean("cricketCoach", SportsCoach.class);
		System.out.println(spCoach.getTimingShedule());
	}

}
