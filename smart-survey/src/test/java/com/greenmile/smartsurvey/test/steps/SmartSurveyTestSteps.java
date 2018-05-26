package com.greenmile.smartsurvey.test.steps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.greenmile.smartsurvey.exception.BusinessException;
import com.greenmile.smartsurvey.model.AppRule;
import com.greenmile.smartsurvey.model.Event;
import com.greenmile.smartsurvey.model.Organization;
import com.greenmile.smartsurvey.model.Question;
import com.greenmile.smartsurvey.model.SmartSurvey;
import com.greenmile.smartsurvey.model.answer.Answer;
import com.greenmile.smartsurvey.model.answer.NumberAnswer;
import com.greenmile.smartsurvey.model.answer.Section;
import com.greenmile.smartsurvey.model.answer.ShortTextAnswer;
import com.greenmile.smartsurvey.model.condition.Condition;
import com.greenmile.smartsurvey.model.condition.Conditionable;
import com.greenmile.smartsurvey.service.SmartSurveyService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SmartSurveyTestSteps {

	private List<Organization> organizations;
	private List<AppRule> appRules;
	private List<Event> events;
	private List<Conditionable> conditionables;
	private List<Condition> conditions;

	private List<Section> sections;
	private List<Question> questions;
	private List<Answer> answers;
	private SmartSurvey smartSurvey;
	private SmartSurveyService smartSurveyService = new SmartSurveyService();

	@Given("^that description is \"(.*?)\"$")
	public void that_description_is(String description) throws Throwable {
		if(this.smartSurvey == null) {
			this.smartSurvey = new SmartSurvey();
		}
		this.smartSurvey.setDescription(description);
	}
	
	@Given("^that organization is$")
	public void that_organizations_is(List<Organization> organizations) throws Throwable {
		this.organizations = organizations;
	}

	@Given("^that triggerEvent is$")
	public void that_triggerEvent_is(List<Event> events) throws Throwable {
		this.events = events;
	}

	@Given("^that conditionable is$")
	public void that_conditionable_is(List<Conditionable> conditionables) throws Throwable {
		this.conditionables = conditionables;
	}

	@Given("^that condition is$")
	public void that_condition_is(List<Condition> conditions) throws Throwable {
		this.conditions = conditions;
	}

	@Given("^that section is$")
	public void that_section_is(List<Section> sections) throws Throwable {
		this.sections = sections;
	}

	@Given("^that question is$")
	public void that_question_is(List<Question> questions) throws Throwable {
		this.questions = questions;
	}

	@Given("^that answer is$")
	public void that_answer_is(Map<String, String> tableData) throws Throwable {
		
		String content = tableData.get("content");
		boolean defaultAnswer = Boolean.parseBoolean(tableData.get("defaultAnswer"));
		long id = 1;
		
		Answer answer;

		try {
			long numberAnswer = Long.parseLong(content);
			answer = new NumberAnswer();
			answer.setContent(numberAnswer);
			answer.setDefaultAnswer(defaultAnswer);
			answer.setId(id);

		} catch (NumberFormatException e) {
			answer = new ShortTextAnswer();
			answer.setContent(content);
			answer.setDefaultAnswer(defaultAnswer);
			answer.setId(id);
		}
		
		if(this.answers == null) {
			this.answers = new ArrayList<>();
		}
		
		this.answers.add(answer);

	}

	@Given("^the creation of a smartsurvey$")
	public void the_creation_of_a_smartsurvey() throws Throwable {

		SmartSurvey smartSurvey;
		if (this.smartSurvey == null) {
			smartSurvey = new SmartSurvey();
		} else {
			smartSurvey = this.smartSurvey;
		}

		if (organizations != null) {
			smartSurvey.setOrganization(organizations.iterator().next());
		}

		if (appRules == null) {
			AppRule appRule = new AppRule();

			if (events != null) {
				appRule.setTriggerEvent(events.iterator().next());
			}

			if (conditions != null) {
				Condition condition = conditions.iterator().next();

				if (conditionables != null) {
					condition.setConditionable(conditionables.iterator().next());
					appRule.setConditions(conditions);
				}

			}

			this.appRules = new ArrayList<AppRule>();
			this.appRules.add(appRule);

		}

		smartSurvey.setAppRules(appRules);

		if (this.sections != null) {
			if (this.questions != null) {
				if (this.answers != null && !this.answers.isEmpty()) {
					this.questions.iterator().next().setAnswer(this.answers.iterator().next());
				}
				this.sections.iterator().next().setQuestions(this.questions);

			}
			smartSurvey.setSections(this.sections);
		}

		this.smartSurvey = smartSurvey;
	}
	
	@Then("^it is included successfully")
	public void then_it_is_included_successfully() throws BusinessException {
		smartSurveyService.create(this.smartSurvey);
	}

	@Then("^the message is \"(.*?)\"$")
	public void then_the_message_is(String message) {
		try {
			smartSurveyService.create(this.smartSurvey);
		} catch (BusinessException e) {
			assertEquals(message, e.getMessage());
		}
	}



}
