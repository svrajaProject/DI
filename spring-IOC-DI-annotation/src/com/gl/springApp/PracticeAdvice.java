package com.gl.springApp;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice {

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Do More Practice";
	}

}
