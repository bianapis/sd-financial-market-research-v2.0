package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveInputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveInputModel   {
  private Object financialMarketResearchDirectoryEntryRetrieveActionTaskRecord = null;

  private String financialMarketResearchDirectoryEntryRetrieveActionRequest = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord financialMarketResearchDirectoryEntryInstanceReportRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis financialMarketResearchDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialMarketResearchDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getFinancialMarketResearchDirectoryEntryRetrieveActionTaskRecord() {
    return financialMarketResearchDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryRetrieveActionTaskRecord(Object financialMarketResearchDirectoryEntryRetrieveActionTaskRecord) {
    this.financialMarketResearchDirectoryEntryRetrieveActionTaskRecord = financialMarketResearchDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialMarketResearchDirectoryEntryRetrieveActionRequest
  **/

  public String getFinancialMarketResearchDirectoryEntryRetrieveActionRequest() {
    return financialMarketResearchDirectoryEntryRetrieveActionRequest;
  }

  public void setFinancialMarketResearchDirectoryEntryRetrieveActionRequest(String financialMarketResearchDirectoryEntryRetrieveActionRequest) {
    this.financialMarketResearchDirectoryEntryRetrieveActionRequest = financialMarketResearchDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get financialMarketResearchDirectoryEntryInstanceReportRecord
   * @return financialMarketResearchDirectoryEntryInstanceReportRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord getFinancialMarketResearchDirectoryEntryInstanceReportRecord() {
    return financialMarketResearchDirectoryEntryInstanceReportRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportRecord(CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord financialMarketResearchDirectoryEntryInstanceReportRecord) {
    this.financialMarketResearchDirectoryEntryInstanceReportRecord = financialMarketResearchDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get financialMarketResearchDirectoryEntryInstanceAnalysis
   * @return financialMarketResearchDirectoryEntryInstanceAnalysis
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis getFinancialMarketResearchDirectoryEntryInstanceAnalysis() {
    return financialMarketResearchDirectoryEntryInstanceAnalysis;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysis(CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis financialMarketResearchDirectoryEntryInstanceAnalysis) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysis = financialMarketResearchDirectoryEntryInstanceAnalysis;
  }


}

