package com.greenmile.smartsurvey.model;

import com.greenmile.smartsurvey.model.condition.Conditionable;

public class LocationType extends Conditionable{

	private boolean enabled;


	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
