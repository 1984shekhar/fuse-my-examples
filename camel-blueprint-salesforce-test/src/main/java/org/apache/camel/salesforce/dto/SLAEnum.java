/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SLA__c
 */
public enum SLAEnum {

    // Gold
    GOLD("Gold"),
    // Silver
    SILVER("Silver"),
    // Platinum
    PLATINUM("Platinum"),
    // Bronze
    BRONZE("Bronze");

    final String value;

    private SLAEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SLAEnum fromValue(String value) {
        for (SLAEnum e : SLAEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}