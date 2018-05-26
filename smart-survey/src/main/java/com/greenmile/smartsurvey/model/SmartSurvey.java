package com.greenmile.smartsurvey.model;

import java.util.List;

import com.greenmile.smartsurvey.model.answer.Section;

public class SmartSurvey {

	private String description;
	private Organization organization;
	private List<AppRule> appRules;
	private List<Section> sections;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<AppRule> getAppRules() {
		return appRules;
	}

	public void setAppRules(List<AppRule> appRules) {
		this.appRules = appRules;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

}
