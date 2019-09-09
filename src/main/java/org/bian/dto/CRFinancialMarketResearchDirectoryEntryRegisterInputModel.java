package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRegisterInputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRegisterInputModel   {
  private String financialMarketResearchServicingSessionReference = null;

  private Object financialMarketResearchDirectoryEntryRegisterActionRecord = null;

  private String financialMarketResearchDirectoryEntryInstanceStatus = null;

  private CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialMarketResearchServicingSessionReference
  **/

  public String getFinancialMarketResearchServicingSessionReference() {
    return financialMarketResearchServicingSessionReference;
  }

  public void setFinancialMarketResearchServicingSessionReference(String financialMarketResearchServicingSessionReference) {
    this.financialMarketResearchServicingSessionReference = financialMarketResearchServicingSessionReference;
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

  public CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


}

