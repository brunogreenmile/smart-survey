package com.greenmile.smartsurvey.model;

import com.greenmile.smartsurvey.model.condition.Conditionable;

public class Driver extends Conditionable {

	private String name;
	private String login;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
