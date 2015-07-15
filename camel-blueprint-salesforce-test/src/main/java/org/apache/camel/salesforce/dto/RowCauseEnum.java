/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RowCause
 */
public enum RowCauseEnum {

    // Owner
    OWNER("Owner"),
    // Manual
    MANUAL("Manual"),
    // Rule
    RULE("Rule"),
    // ImplicitChild
    IMPLICITCHILD("ImplicitChild"),
    // ImplicitParent
    IMPLICITPARENT("ImplicitParent"),
    // Team
    TEAM("Team"),
    // Territory
    TERRITORY("Territory"),
    // TerritoryManual
    TERRITORYMANUAL("TerritoryManual"),
    // TerritoryRule
    TERRITORYRULE("TerritoryRule"),
    // Territory2Forecast
    TERRITORY2FORECAST("Territory2Forecast");

    final String value;

    private RowCauseEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RowCauseEnum fromValue(String value) {
        for (RowCauseEnum e : RowCauseEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}