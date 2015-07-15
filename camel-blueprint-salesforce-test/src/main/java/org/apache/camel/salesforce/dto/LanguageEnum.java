/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Language
 */
public enum LanguageEnum {

    // en_US
    EN_US("en_US"),
    // de
    DE("de"),
    // es
    ES("es"),
    // fr
    FR("fr"),
    // it
    IT("it"),
    // ja
    JA("ja"),
    // sv
    SV("sv"),
    // ko
    KO("ko"),
    // zh_TW
    ZH_TW("zh_TW"),
    // zh_CN
    ZH_CN("zh_CN"),
    // pt_BR
    PT_BR("pt_BR"),
    // nl_NL
    NL_NL("nl_NL"),
    // da
    DA("da"),
    // th
    TH("th"),
    // fi
    FI("fi"),
    // ru
    RU("ru"),
    // es_MX
    ES_MX("es_MX"),
    // no
    NO("no");

    final String value;

    private LanguageEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LanguageEnum fromValue(String value) {
        for (LanguageEnum e : LanguageEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}