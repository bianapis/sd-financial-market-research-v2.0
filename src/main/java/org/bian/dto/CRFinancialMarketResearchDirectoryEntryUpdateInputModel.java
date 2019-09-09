package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryUpdateInputModel
 */
public class CRFinancialMarketResearchDirectoryEntryUpdateInputModel   {
  private String financialMarketResearchServicingSessionReference = null;

  private String financialMarketResearchDirectoryEntryInstanceReference = null;

  private CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private Object financialMarketResearchDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get financialMarketResearchDirectoryEntryInstanceRecord
   * @return financialMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialMarketResearchDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getFinancialMarketResearchDirectoryEntryUpdateActionTaskRecord() {
    return financialMarketResearchDirectoryEntryUpdateActionTaskRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryUpdateActionTaskRecord(Object financialMarketResearchDirectoryEntryUpdateActionTaskRecord) {
    this.financialMarketResearchDirectoryEntryUpdateActionTaskRecord = financialMarketResearchDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

