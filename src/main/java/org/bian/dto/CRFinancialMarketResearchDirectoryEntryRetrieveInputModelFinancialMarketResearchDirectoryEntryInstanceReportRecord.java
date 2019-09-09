package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveInputModelFinancialMarketResearchDirectoryEntryInstanceReportRecord   {
  private String financialMarketResearchDirectoryEntryInstanceReportReference = null;

  private String financialMarketResearchDirectoryEntryInstanceReportType = null;

  private String financialMarketResearchDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialMarketResearchDirectoryEntryInstanceReportReference
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceReportReference() {
    return financialMarketResearchDirectoryEntryInstanceReportReference;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportReference(String financialMarketResearchDirectoryEntryInstanceReportReference) {
    this.financialMarketResearchDirectoryEntryInstanceReportReference = financialMarketResearchDirectoryEntryInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialMarketResearchDirectoryEntryInstanceReportParameters
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceReportParameters() {
    return financialMarketResearchDirectoryEntryInstanceReportParameters;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReportParameters(String financialMarketResearchDirectoryEntryInstanceReportParameters) {
    this.financialMarketResearchDirectoryEntryInstanceReportParameters = financialMarketResearchDirectoryEntryInstanceReportParameters;
  }


}

