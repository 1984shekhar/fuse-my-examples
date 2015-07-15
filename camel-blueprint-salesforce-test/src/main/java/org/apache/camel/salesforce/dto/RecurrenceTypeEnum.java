/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceType
 */
public enum RecurrenceTypeEnum {

    // RecursDaily
    RECURSDAILY("RecursDaily"),
    // RecursEveryWeekday
    RECURSEVERYWEEKDAY("RecursEveryWeekday"),
    // RecursMonthly
    RECURSMONTHLY("RecursMonthly"),
    // RecursMonthlyNth
    RECURSMONTHLYNTH("RecursMonthlyNth"),
    // RecursWeekly
    RECURSWEEKLY("RecursWeekly"),
    // RecursYearly
    RECURSYEARLY("RecursYearly"),
    // RecursYearlyNth
    RECURSYEARLYNTH("RecursYearlyNth");

    final String value;

    private RecurrenceTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RecurrenceTypeEnum fromValue(String value) {
        for (RecurrenceTypeEnum e : RecurrenceTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}