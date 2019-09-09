package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord   {
  private String financialMarketResearchReportTypeReference = null;

  private String financialMarketResearchReportTypeDefinition = null;

  private String financialMarketResearchReportVersionPeriod = null;

  private Object financialMarketResearchReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific type of predefined market research report or database 
   * @return financialMarketResearchReportTypeReference
  **/

  public String getFinancialMarketResearchReportTypeReference() {
    return financialMarketResearchReportTypeReference;
  }

  public void setFinancialMarketResearchReportTypeReference(String financialMarketResearchReportTypeReference) {
    this.financialMarketResearchReportTypeReference = financialMarketResearchReportTypeReference;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the content of the report or database in any suitable form 
   * @return financialMarketResearchReport
  **/

  public Object getFinancialMarketResearchReport() {
    return financialMarketResearchReport;
  }

  public void setFinancialMarketResearchReport(Object financialMarketResearchReport) {
    this.financialMarketResearchReport = financialMarketResearchReport;
  }


}

