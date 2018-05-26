package com.greenmile.smartsurvey.model.condition;

public class Condition {

	private long id;
	private String conditionType;
	private int conditionableType;
	private Conditionable conditionable;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public int getConditionableType() {
		return conditionableType;
	}

	public void setConditionableType(int conditionableType) {
		this.conditionableType = conditionableType;
	}

	public Conditionable getConditionable() {
		return conditionable;
	}

	public void setConditionable(Conditionable conditionable) {
		this.conditionable = conditionable;
	}

}
