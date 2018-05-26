package com.greenmile.smartsurvey.service;

import java.util.ArrayList;
import java.util.List;

import com.greenmile.smartsurvey.exception.BusinessException;
import com.greenmile.smartsurvey.model.SmartSurvey;

public class SmartSurveyService {

	private List<SmartSurvey> smartSurveysRepository;
	
	public SmartSurveyService() {
	  this.smartSurveysRepository = new ArrayList<SmartSurvey>();	
	}

	public void create(SmartSurvey smartSurvey) throws BusinessException {
		validate(smartSurvey);
	    this.smartSurveysRepository.add(smartSurvey);			
	}


    /**
     * @TODO implementar
     * @param id
     * @param smartSurvey
     */
	public void update(long id, SmartSurvey smartSurvey) throws BusinessException {
		
    }
	
    /**
     * @TODO implementar
     * @param id
     * @param smartSurvey
     */
	public void delete(long id, SmartSurvey smartSurvey) throws BusinessException {
		
    }

    /**
     * @TODO implementar
     * @param id
     * @param smartSurvey
     */
	public SmartSurvey findSmartSurvey(long id) throws BusinessException {
      return null;
	}
	
	
	private void validate(SmartSurvey smartSurvey) throws BusinessException {
		
		
		if(smartSurvey.getDescription() == null || smartSurvey.getDescription().isEmpty()) {
			throw new BusinessException("Description is mandatory");	
		} else if(smartSurvey.getOrganization() == null) {
			throw new BusinessException("Organization is mandatory");	
		} else if (smartSurvey.getSections() != null) {
		  while(smartSurvey.getSections().iterator().hasNext()) {
		    if(smartSurvey.getSections().iterator().next().getTitle() == null || smartSurvey.getSections().iterator().next().getTitle().isEmpty()) {
		      throw new BusinessException("Section Title is mandatory");
		    } else if (smartSurvey.getSections().iterator().next().getQuestions() == null) {
		      throw new BusinessException("Section Questions are mandatory");
		    }
		    break;
		  }
		} else if (smartSurvey.getAppRules() == null) {
	      throw new BusinessException("It is mandatory to add at least one Application Rule");
		}
	}

	public List<SmartSurvey> getSmartSurveys() {
		return smartSurveysRepository;
	}

	public void setSmartSurveys(List<SmartSurvey> smartSurveys) {
		this.smartSurveysRepository = smartSurveys;
	}

}
