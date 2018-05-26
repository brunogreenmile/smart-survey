package com.greenmile.smartsurvey.model;

import com.greenmile.smartsurvey.model.answer.Answer;

public class Question {
	private long id;
	private String description;
	private Answer answer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
