package com.greenmile.smartsurvey.model.condition;

public enum ConditionableType {
	LocationType(1),
	RoutOrigin(2),
	RoutOrganization(3),
	Driver(4);
	
    private final int conditionType;
    
    ConditionableType(int conditionTypeValue){
    	conditionType = conditionTypeValue;
    }
    public int getConditionType(){
        return conditionType;
    }
}
