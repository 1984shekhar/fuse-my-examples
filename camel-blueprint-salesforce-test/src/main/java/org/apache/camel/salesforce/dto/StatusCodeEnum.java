/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StatusCode
 */
public enum StatusCodeEnum {

    // Draft
    DRAFT("Draft"),
    // InApproval
    INAPPROVAL("InApproval"),
    // Activated
    ACTIVATED("Activated"),
    // Terminated
    TERMINATED("Terminated"),
    // Expired
    EXPIRED("Expired");

    final String value;

    private StatusCodeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusCodeEnum fromValue(String value) {
        for (StatusCodeEnum e : StatusCodeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}