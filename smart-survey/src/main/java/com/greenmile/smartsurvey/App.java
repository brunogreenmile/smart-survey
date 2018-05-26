package com.greenmile.smartsurvey;

import com.greenmile.smartsurvey.service.SmartSurveyService;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static SmartSurveyService service;
	
    public static void main( String[] args )
    {
    	service = new SmartSurveyService();
    }
}
