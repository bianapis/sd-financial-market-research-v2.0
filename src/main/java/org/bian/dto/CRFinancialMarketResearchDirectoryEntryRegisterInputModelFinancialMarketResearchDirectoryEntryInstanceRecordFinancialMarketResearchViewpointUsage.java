package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage
 */
public class CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage   {
  private String financialMarketResearchReportRequest = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the research request 
   * @return financialMarketResearchReportRequest
  **/

  public String getFinancialMarketResearchReportRequest() {
    return financialMarketResearchReportRequest;
  }

  public void setFinancialMarketResearchReportRequest(String financialMarketResearchReportRequest) {
    this.financialMarketResearchReportRequest = financialMarketResearchReportRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The employee/business unit requesting the research 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

