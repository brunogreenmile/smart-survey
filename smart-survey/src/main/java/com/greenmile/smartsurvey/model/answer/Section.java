package com.greenmile.smartsurvey.model.answer;

import java.util.List;

import com.greenmile.smartsurvey.model.Question;

public class Section {
	private long id;
	private String title;
	private List<Question> questions;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addQuestion(Question question) {
		this.questions.add(question);
	}

	public void removeQuestion(Question question) {
		this.questions.remove(question);
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
