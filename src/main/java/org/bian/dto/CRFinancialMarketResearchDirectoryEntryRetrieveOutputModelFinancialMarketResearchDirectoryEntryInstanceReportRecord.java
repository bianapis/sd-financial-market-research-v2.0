package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord   {
  private String financialMarketResearchDirectoryEntryInstanceReportData = null;

  private String financialMarketResearchDirectoryEntryInstanceReportType = null;

  private Object financialMarketResearchDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialMarketResearchDirectoryEntryInstanceReportData
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceReportData() {
    return financialMarketResearchDirectoryEntryInstanceReportData;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportData(String financialMarketResearchDirectoryEntryInstanceReportData) {
    this.financialMarketResearchDirectoryEntryInstanceReportData = financialMarketResearchDirectoryEntryInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialMarketResearchDirectoryEntryInstanceReportType
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceReportType() {
    return financialMarketResearchDirectoryEntryInstanceReportType;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportType(String financialMarketResearchDirectoryEntryInstanceReportType) {
    this.financialMarketResearchDirectoryEntryInstanceReportType = financialMarketResearchDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialMarketResearchDirectoryEntryInstanceReport
  **/

  public Object getFinancialMarketResearchDirectoryEntryInstanceReport() {
    return financialMarketResearchDirectoryEntryInstanceReport;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReport(Object financialMarketResearchDirectoryEntryInstanceReport) {
    this.financialMarketResearchDirectoryEntryInstanceReport = financialMarketResearchDirectoryEntryInstanceReport;
  }


}

