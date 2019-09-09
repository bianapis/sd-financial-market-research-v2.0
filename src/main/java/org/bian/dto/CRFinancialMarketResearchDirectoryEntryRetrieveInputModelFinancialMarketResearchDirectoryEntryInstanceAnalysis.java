package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceAnalysis   {
  private String financialMarketResearchDirectoryEntryInstanceAnalysisReference = null;

  private String financialMarketResearchDirectoryEntryInstanceAnalysisReportType = null;

  private String financialMarketResearchDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialMarketResearchDirectoryEntryInstanceAnalysisReference
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceAnalysisReference() {
    return financialMarketResearchDirectoryEntryInstanceAnalysisReference;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysisReference(String financialMarketResearchDirectoryEntryInstanceAnalysisReference) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysisReference = financialMarketResearchDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialMarketResearchDirectoryEntryInstanceAnalysisParameters
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceAnalysisParameters() {
    return financialMarketResearchDirectoryEntryInstanceAnalysisParameters;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceAnalysisParameters(String financialMarketResearchDirectoryEntryInstanceAnalysisParameters) {
    this.financialMarketResearchDirectoryEntryInstanceAnalysisParameters = financialMarketResearchDirectoryEntryInstanceAnalysisParameters;
  }


}

