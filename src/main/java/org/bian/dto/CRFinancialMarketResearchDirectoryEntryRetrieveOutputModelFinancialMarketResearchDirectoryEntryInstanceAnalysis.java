package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis   {
  private String financialMarketResearchDirectoryEntryInstanceAnalysisData = null;

  private String financialMarketResearchDirectoryEntryInstanceAnalysisReportType = null;

  private Object financialMarketResearchDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialMarketResearchDirectoryEntryInstanceAnalysisData
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceAnalysisData() {
    return financialMarketResearchDirectoryEntryInstanceAnalysisData;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysisData(String financialMarketResearchDirectoryEntryInstanceAnalysisData) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysisData = financialMarketResearchDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialMarketResearchDirectoryEntryInstanceAnalysisReportType
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceAnalysisReportType() {
    return financialMarketResearchDirectoryEntryInstanceAnalysisReportType;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysisReportType(String financialMarketResearchDirectoryEntryInstanceAnalysisReportType) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysisReportType = financialMarketResearchDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return financialMarketResearchDirectoryEntryInstanceAnalysisReport
  **/

  public Object getFinancialMarketResearchDirectoryEntryInstanceAnalysisReport() {
    return financialMarketResearchDirectoryEntryInstanceAnalysisReport;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysisReport(Object financialMarketResearchDirectoryEntryInstanceAnalysisReport) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysisReport = financialMarketResearchDirectoryEntryInstanceAnalysisReport;
  }


}

