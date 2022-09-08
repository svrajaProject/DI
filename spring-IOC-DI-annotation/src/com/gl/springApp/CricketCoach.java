package com.gl.springApp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach {

	private ExpertAdvice expertAdvice;

	public CricketCoach(ExpertAdvice expertAdvice) {
		super();
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getTimingShedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getAdvice();
	}

}
