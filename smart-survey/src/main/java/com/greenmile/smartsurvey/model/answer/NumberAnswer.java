package com.greenmile.smartsurvey.model.answer;

public class NumberAnswer extends Answer {

	private float content;
	
	@Override
	public void setContent(Object content) {
		// TODO Auto-generated method stub
		this.content = Float.parseFloat(content + "");
	}

	@Override
	public Object getContent() {
		// TODO Auto-generated method stub
		return this.content;
	}


  
}
