package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecord   {
  private String financialMarketResearchViewpointType = null;

  private String financialMarketResearchViewpointDescription = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage = null;


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

  public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord getReferencedFinancialMarketResearchRecord() {
    return referencedFinancialMarketResearchRecord;
  }

  public void setReferencedFinancialMarketResearchRecord(CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord) {
    this.referencedFinancialMarketResearchRecord = referencedFinancialMarketResearchRecord;
  }


  /**
   * Get financialMarketResearchViewpointUsage
   * @return financialMarketResearchViewpointUsage
  **/

  public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage getFinancialMarketResearchViewpointUsage() {
    return financialMarketResearchViewpointUsage;
  }

  public void setFinancialMarketResearchViewpointUsage(CRFinancialMarketResearchDirectoryEntryRetrieveOutputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage) {
    this.financialMarketResearchViewpointUsage = financialMarketResearchViewpointUsage;
  }


}

