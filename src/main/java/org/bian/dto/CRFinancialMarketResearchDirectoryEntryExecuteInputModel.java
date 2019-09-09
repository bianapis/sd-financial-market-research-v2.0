package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryExecuteInputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryExecuteInputModel
 */
public class CRFinancialMarketResearchDirectoryEntryExecuteInputModel   {
  private String financialMarketResearchServicingSessionReference = null;

  private String financialMarketResearchDirectoryEntryInstanceReference = null;

  private CRFinancialMarketResearchDirectoryEntryExecuteInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private Object financialMarketResearchDirectoryEntryExecuteActionTaskRecord = null;

  private CRFinancialMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRFinancialMarketResearchDirectoryEntryExecuteInputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryExecuteInputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return financialMarketResearchDirectoryEntryExecuteActionTaskRecord
  **/

  public Object getFinancialMarketResearchDirectoryEntryExecuteActionTaskRecord() {
    return financialMarketResearchDirectoryEntryExecuteActionTaskRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryExecuteActionTaskRecord(Object financialMarketResearchDirectoryEntryExecuteActionTaskRecord) {
    this.financialMarketResearchDirectoryEntryExecuteActionTaskRecord = financialMarketResearchDirectoryEntryExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFinancialMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFinancialMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

