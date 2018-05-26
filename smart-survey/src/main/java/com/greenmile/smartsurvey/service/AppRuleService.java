package com.greenmile.smartsurvey.service;

import java.util.List;

import com.greenmile.smartsurvey.model.AppRule;

public class AppRuleService {
	
	private List<AppRule> appRules;
	
	public void createAppRule(AppRule appRule) {
		this.appRules.add(appRule);
	}

	public List<AppRule> getAppRules() {
		return appRules;
	}

	public void setAppRules(List<AppRule> appRules) {
		this.appRules = appRules;
	}
	
	

}
