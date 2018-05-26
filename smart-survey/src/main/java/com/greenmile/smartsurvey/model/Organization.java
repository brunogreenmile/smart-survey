package com.greenmile.smartsurvey.model;

import com.greenmile.smartsurvey.model.condition.Conditionable;

public class Organization extends Conditionable {
	private String key;

	public Organization(String description, String key) {
        super.setDescription(description);
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
