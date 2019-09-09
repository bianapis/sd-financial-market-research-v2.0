package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryExecuteOutputModel
 */
public class CRFinancialMarketResearchDirectoryEntryExecuteOutputModel   {
  private CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private String financialMarketResearchDirectoryEntryExecuteActionTaskReference = null;

  private Object financialMarketResearchDirectoryEntryExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get financialMarketResearchDirectoryEntryInstanceRecord
   * @return financialMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Research Directory Entry instance execute service call 
   * @return financialMarketResearchDirectoryEntryExecuteActionTaskReference
  **/

  public String getFinancialMarketResearchDirectoryEntryExecuteActionTaskReference() {
    return financialMarketResearchDirectoryEntryExecuteActionTaskReference;
  }

  public void setFinancialMarketResearchDirectoryEntryExecuteActionTaskReference(String financialMarketResearchDirectoryEntryExecuteActionTaskReference) {
    this.financialMarketResearchDirectoryEntryExecuteActionTaskReference = financialMarketResearchDirectoryEntryExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

