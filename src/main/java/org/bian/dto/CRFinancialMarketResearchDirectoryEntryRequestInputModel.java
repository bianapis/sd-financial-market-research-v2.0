package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecord;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRequestInputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRequestInputModel   {
  private String financialMarketResearchServicingSessionReference = null;

  private String financialMarketResearchDirectoryEntryInstanceReference = null;

  private CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private Object financialMarketResearchDirectoryEntryRequestActionTaskRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return financialMarketResearchDirectoryEntryRequestActionTaskRecord
  **/

  public Object getFinancialMarketResearchDirectoryEntryRequestActionTaskRecord() {
    return financialMarketResearchDirectoryEntryRequestActionTaskRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryRequestActionTaskRecord(Object financialMarketResearchDirectoryEntryRequestActionTaskRecord) {
    this.financialMarketResearchDirectoryEntryRequestActionTaskRecord = financialMarketResearchDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFinancialMarketResearchDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFinancialMarketResearchDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

