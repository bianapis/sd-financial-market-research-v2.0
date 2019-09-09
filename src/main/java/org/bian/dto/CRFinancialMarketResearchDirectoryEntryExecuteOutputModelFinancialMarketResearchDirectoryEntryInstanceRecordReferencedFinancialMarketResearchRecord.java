package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord
 */
public class CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord   {
  private String financialMarketResearchReportTypeDefinition = null;

  private String financialMarketResearchReportVersionPeriod = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes the available market research report content (e.g. customer social network usage analysis) 
   * @return financialMarketResearchReportTypeDefinition
  **/

  public String getFinancialMarketResearchReportTypeDefinition() {
    return financialMarketResearchReportTypeDefinition;
  }

  public void setFinancialMarketResearchReportTypeDefinition(String financialMarketResearchReportTypeDefinition) {
    this.financialMarketResearchReportTypeDefinition = financialMarketResearchReportTypeDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the version and period covered by the research 
   * @return financialMarketResearchReportVersionPeriod
  **/

  public String getFinancialMarketResearchReportVersionPeriod() {
    return financialMarketResearchReportVersionPeriod;
  }

  public void setFinancialMarketResearchReportVersionPeriod(String financialMarketResearchReportVersionPeriod) {
    this.financialMarketResearchReportVersionPeriod = financialMarketResearchReportVersionPeriod;
  }


}

