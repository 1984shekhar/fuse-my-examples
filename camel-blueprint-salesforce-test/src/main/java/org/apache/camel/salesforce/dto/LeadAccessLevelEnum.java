/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LeadAccessLevel
 */
public enum LeadAccessLevelEnum {

    // Read
    READ("Read"),
    // Edit
    EDIT("Edit"),
    // All
    ALL("All");

    final String value;

    private LeadAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LeadAccessLevelEnum fromValue(String value) {
        for (LeadAccessLevelEnum e : LeadAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}