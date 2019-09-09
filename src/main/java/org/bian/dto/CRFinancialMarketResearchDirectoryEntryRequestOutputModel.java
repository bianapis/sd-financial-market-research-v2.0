package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRequestOutputModel
 */
public class CRFinancialMarketResearchDirectoryEntryRequestOutputModel   {
  private CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord = null;

  private String financialMarketResearchDirectoryEntryRequestActionTaskReference = null;

  private Object financialMarketResearchDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get financialMarketResearchDirectoryEntryInstanceRecord
   * @return financialMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord getFinancialMarketResearchDirectoryEntryInstanceRecord() {
    return financialMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setFinancialMarketResearchDirectoryEntryInstanceRecord(CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord financialMarketResearchDirectoryEntryInstanceRecord) {
    this.financialMarketResearchDirectoryEntryInstanceRecord = financialMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Research Directory Entry instance request service call 
   * @return financialMarketResearchDirectoryEntryRequestActionTaskReference
  **/

  public String getFinancialMarketResearchDirectoryEntryRequestActionTaskReference() {
    return financialMarketResearchDirectoryEntryRequestActionTaskReference;
  }

  public void setFinancialMarketResearchDirectoryEntryRequestActionTaskReference(String financialMarketResearchDirectoryEntryRequestActionTaskReference) {
    this.financialMarketResearchDirectoryEntryRequestActionTaskReference = financialMarketResearchDirectoryEntryRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

