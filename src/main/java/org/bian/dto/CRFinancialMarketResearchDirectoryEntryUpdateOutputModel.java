package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryUpdateOutputModel
 */
public class CRFinancialMarketResearchDirectoryEntryUpdateOutputModel   {
  private CRFinancialMarketResearchDirectoryEntryUpdateInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private String financialMarketResearchDirectoryEntryUpdateActionTaskReference = null;

  private Object financialMarketResearchDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialMarketResearchDirectoryEntryUpdateActionTaskReference
  **/

  public String getFinancialMarketResearchDirectoryEntryUpdateActionTaskReference() {
    return financialMarketResearchDirectoryEntryUpdateActionTaskReference;
  }

  public void setFinancialMarketResearchDirectoryEntryUpdateActionTaskReference(String financialMarketResearchDirectoryEntryUpdateActionTaskReference) {
    this.financialMarketResearchDirectoryEntryUpdateActionTaskReference = financialMarketResearchDirectoryEntryUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

