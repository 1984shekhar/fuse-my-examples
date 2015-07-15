/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ExternalDataSource
 */
public class QueryRecordsExternalDataSource extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ExternalDataSource> records;

    public List<ExternalDataSource> getRecords() {
        return records;
    }

    public void setRecords(List<ExternalDataSource> records) {
        this.records = records;
    }
}
