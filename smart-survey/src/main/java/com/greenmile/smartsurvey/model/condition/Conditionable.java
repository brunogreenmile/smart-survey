package com.greenmile.smartsurvey.model.condition;

public class Conditionable {
	private long id;
	private String description;
	private boolean enabled;

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

}
