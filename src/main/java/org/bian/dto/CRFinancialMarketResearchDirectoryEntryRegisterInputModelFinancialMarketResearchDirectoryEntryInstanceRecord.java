package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage;
import org.bian.dto.CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord
 */
public class CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecord   {
  private String financialMarketResearchViewpointType = null;

  private String financialMarketResearchViewpointDescription = null;

  private CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord = null;

  private CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage = null;


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

  public CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord getReferencedFinancialMarketResearchRecord() {
    return referencedFinancialMarketResearchRecord;
  }

  public void setReferencedFinancialMarketResearchRecord(CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordReferencedFinancialMarketResearchRecord referencedFinancialMarketResearchRecord) {
    this.referencedFinancialMarketResearchRecord = referencedFinancialMarketResearchRecord;
  }


  /**
   * Get financialMarketResearchViewpointUsage
   * @return financialMarketResearchViewpointUsage
  **/

  public CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage getFinancialMarketResearchViewpointUsage() {
    return financialMarketResearchViewpointUsage;
  }

  public void setFinancialMarketResearchViewpointUsage(CRFinancialMarketResearchDirectoryEntryRegisterInputModelFinancialMarketResearchDirectoryEntryInstanceRecordFinancialMarketResearchViewpointUsage financialMarketResearchViewpointUsage) {
    this.financialMarketResearchViewpointUsage = financialMarketResearchViewpointUsage;
  }


}

