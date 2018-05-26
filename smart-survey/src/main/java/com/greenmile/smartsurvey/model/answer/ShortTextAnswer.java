package com.greenmile.smartsurvey.model.answer;

public class ShortTextAnswer extends Answer {
	private String content;

	@Override
	public void setContent(Object content) {
		this.content = content + "";
	}

	@Override
	public Object getContent() {
		return this.content;
	}
	

}
