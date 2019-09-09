package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRegisterOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRegisterOutputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRegisterOutputModel   {
  private String financialMarketResearchDirectoryEntryInstanceReference = null;

  private String financialMarketResearchDirectoryEntryRegisterActionReference = null;

  private Object financialMarketResearchDirectoryEntryRegisterActionRecord = null;

  private String financialMarketResearchDirectoryEntryInstanceStatus = null;

  private CRFinancialMarketResearchDirectoryEntryRegisterOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Market Research Directory Entry instance 
   * @return financialMarketResearchDirectoryEntryInstanceReference
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceReference() {
    return financialMarketResearchDirectoryEntryInstanceReference;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceReference(String financialMarketResearchDirectoryEntryInstanceReference) {
    this.financialMarketResearchDirectoryEntryInstanceReference = financialMarketResearchDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return financialMarketResearchDirectoryEntryRegisterActionReference
  **/

  public String getFinancialMarketResearchDirectoryEntryRegisterActionReference() {
    return financialMarketResearchDirectoryEntryRegisterActionReference;
  }

  public void setFinancialMarketResearchDirectoryEntryRegisterActionReference(String financialMarketResearchDirectoryEntryRegisterActionReference) {
    this.financialMarketResearchDirectoryEntryRegisterActionReference = financialMarketResearchDirectoryEntryRegisterActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return financialMarketResearchDirectoryEntryRegisterActionRecord
  **/

  public Object getFinancialMarketResearchDirectoryEntryRegisterActionRecord() {
    return financialMarketResearchDirectoryEntryRegisterActionRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryRegisterActionRecord(Object financialMarketResearchDirectoryEntryRegisterActionRecord) {
    this.financialMarketResearchDirectoryEntryRegisterActionRecord = financialMarketResearchDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Market Research Directory Entry instance (e.g. initialised, pending, active) 
   * @return financialMarketResearchDirectoryEntryInstanceStatus
  **/

  public String getFinancialMarketResearchDirectoryEntryInstanceStatus() {
    return financialMarketResearchDirectoryEntryInstanceStatus;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceStatus(String financialMarketResearchDirectoryEntryInstanceStatus) {
    this.financialMarketResearchDirectoryEntryInstanceStatus = financialMarketResearchDirectoryEntryInstanceStatus;
  }


  /**
   * Get financialMarketResearchDirectoryEntryInstanceRecord
   * @return financialMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryRegisterOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryRegisterOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


}

