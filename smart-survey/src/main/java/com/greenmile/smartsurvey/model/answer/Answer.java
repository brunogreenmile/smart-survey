package com.greenmile.smartsurvey.model.answer;

public abstract class Answer {
	private long id;
	private boolean defaultAnswer;

	public boolean isDefaultAnswer() {
		return defaultAnswer;
	}

	public void setDefaultAnswer(boolean defaultAnswer) {
		this.defaultAnswer = defaultAnswer;
	}

	public abstract void setContent(Object content);

	public abstract Object getContent();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
