package com.greenmile.smartsurvey.model;

import java.util.List;

import com.greenmile.smartsurvey.model.condition.Condition;

public class AppRule {
	private Event triggerEvent;
	private List<Condition> conditions;

	public Event getTriggerEvent() {
		return triggerEvent;
	}

	public void setTriggerEvent(Event triggerEvent) {
		this.triggerEvent = triggerEvent;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

}
