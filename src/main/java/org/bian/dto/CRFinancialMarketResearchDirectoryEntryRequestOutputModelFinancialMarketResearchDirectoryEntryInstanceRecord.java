package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRequestOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord   {
  private String financialMarketResearchViewpointType = null;

  private String financialMarketResearchViewpointDescription = null;

  private CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of financial market research view provided by the research (e.g. common stock comparison) 
   * @return financialMarketResearchViewpointType
  **/

  public String getFinancialMarketResearchViewpointType() {
    return financialMarketResearchViewpointType;
  }

  public void setFinancialMarketResearchViewpointType(String financialMarketResearchViewpointType) {
    this.financialMarketResearchViewpointType = financialMarketResearchViewpointType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the available market research consolidated for this maintained viewpoint 
   * @return financialMarketResearchViewpointDescription
  **/

  public String getFinancialMarketResearchViewpointDescription() {
    return financialMarketResearchViewpointDescription;
  }

  public void setFinancialMarketResearchViewpointDescription(String financialMarketResearchViewpointDescription) {
    this.financialMarketResearchViewpointDescription = financialMarketResearchViewpointDescription;
  }


  /**
   * Get referencedFinancialMarketResearchRecord
   * @return referencedFinancialMarketResearchRecord
  **/

  public CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord getReferencedFinancialMarketResearchRecord() {
    return referencedFinancialMarketResearchRecord;
  }

  public void setReferencedFinancialMarketResearchRecord(CRFinancialMarketResearchDirectoryEntryExecuteOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord) {
    this.referencedFinancialMarketResearchRecord = referencedFinancialMarketResearchRecord;
  }


  /**
   * Get financialMarketResearchViewpointUsage
   * @return financialMarketResearchViewpointUsage
  **/

  public CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage getFinancialMarketResearchViewpointUsage() {
    return financialMarketResearchViewpointUsage;
  }

  public void setFinancialMarketResearchViewpointUsage(CRFinancialMarketResearchDirectoryEntryRequestInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage) {
    this.financialMarketResearchViewpointUsage = financialMarketResearchViewpointUsage;
  }


}

