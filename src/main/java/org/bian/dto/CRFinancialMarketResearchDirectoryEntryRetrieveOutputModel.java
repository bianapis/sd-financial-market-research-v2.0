package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel   {
  private CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private String financialMarketResearchDirectoryEntryRetrieveActionTaskReference = null;

  private Object financialMarketResearchDirectoryEntryRetrieveActionTaskRecord = null;

  private String financialMarketResearchDirectoryEntryRetrieveActionResponse = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord financialMarketResearchDirectoryEntryInstanceReportRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis financialMarketResearchDirectoryEntryInstanceAnalysis = null;


  /**
   * Get financialMarketResearchDirectoryEntryInstanceRecord
   * @return financialMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Research Directory Entry instance retrieve service call 
   * @return financialMarketResearchDirectoryEntryRetrieveActionTaskReference
  **/

  public String getFinancialMarketResearchDirectoryEntryRetrieveActionTaskReference() {
    return financialMarketResearchDirectoryEntryRetrieveActionTaskReference;
  }

  public void setFinancialMarketResearchDirectoryEntryRetrieveActionTaskReference(String financialMarketResearchDirectoryEntryRetrieveActionTaskReference) {
    this.financialMarketResearchDirectoryEntryRetrieveActionTaskReference = financialMarketResearchDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialMarketResearchDirectoryEntryRetrieveActionResponse
  **/

  public String getFinancialMarketResearchDirectoryEntryRetrieveActionResponse() {
    return financialMarketResearchDirectoryEntryRetrieveActionResponse;
  }

  public void setFinancialMarketResearchDirectoryEntryRetrieveActionResponse(String financialMarketResearchDirectoryEntryRetrieveActionResponse) {
    this.financialMarketResearchDirectoryEntryRetrieveActionResponse = financialMarketResearchDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get financialMarketResearchDirectoryEntryInstanceReportRecord
   * @return financialMarketResearchDirectoryEntryInstanceReportRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord getFinancialMarketResearchDirectoryEntryInstanceReportRecord() {
    return financialMarketResearchDirectoryEntryInstanceReportRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportRecord(CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord financialMarketResearchDirectoryEntryInstanceReportRecord) {
    this.financialMarketResearchDirectoryEntryInstanceReportRecord = financialMarketResearchDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get financialMarketResearchDirectoryEntryInstanceAnalysis
   * @return financialMarketResearchDirectoryEntryInstanceAnalysis
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis getFinancialMarketResearchDirectoryEntryInstanceAnalysis() {
    return financialMarketResearchDirectoryEntryInstanceAnalysis;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysis(CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis financialMarketResearchDirectoryEntryInstanceAnalysis) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysis = financialMarketResearchDirectoryEntryInstanceAnalysis;
  }


}

