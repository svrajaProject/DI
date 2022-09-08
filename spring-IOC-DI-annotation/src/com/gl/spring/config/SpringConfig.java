package com.gl.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.gl.springApp.CricketCoach;
import com.gl.springApp.ExpertAdvice;
import com.gl.springApp.SportsCoach;
import com.gl.springApp.PracticeAdvice;

@Configuration
@Component("com.gl.springApp")
public class SpringConfig {

	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	} 
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
}
