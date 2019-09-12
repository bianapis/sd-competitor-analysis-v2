package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisExecuteInputModelCompetitorAnalysisInstanceRecord;
import org.bian.dto.CRCompeitorAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisExecuteInputModel
 */
public class CRCompeitorAnalysisExecuteInputModel   {
  private String competitorAnalysisServicingSessionReference = null;

  private String compeitorAnalysisInstanceReference = null;

  private CRCompeitorAnalysisExecuteInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;

  private Object compeitorAnalysisExecuteActionTaskRecord = null;

  private CRCompeitorAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return competitorAnalysisServicingSessionReference
  **/

  public String getCompetitorAnalysisServicingSessionReference() {
    return competitorAnalysisServicingSessionReference;
  }

  public void setCompetitorAnalysisServicingSessionReference(String competitorAnalysisServicingSessionReference) {
    this.competitorAnalysisServicingSessionReference = competitorAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compeitor Analysis instance 
   * @return compeitorAnalysisInstanceReference
  **/

  public String getCompeitorAnalysisInstanceReference() {
    return compeitorAnalysisInstanceReference;
  }

  public void setCompeitorAnalysisInstanceReference(String compeitorAnalysisInstanceReference) {
    this.compeitorAnalysisInstanceReference = compeitorAnalysisInstanceReference;
  }


  /**
   * Get competitorAnalysisInstanceRecord
   * @return competitorAnalysisInstanceRecord
  **/

  public CRCompeitorAnalysisExecuteInputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisExecuteInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return compeitorAnalysisExecuteActionTaskRecord
  **/

  public Object getCompeitorAnalysisExecuteActionTaskRecord() {
    return compeitorAnalysisExecuteActionTaskRecord;
  }

  public void setCompeitorAnalysisExecuteActionTaskRecord(Object compeitorAnalysisExecuteActionTaskRecord) {
    this.compeitorAnalysisExecuteActionTaskRecord = compeitorAnalysisExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCompeitorAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCompeitorAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

