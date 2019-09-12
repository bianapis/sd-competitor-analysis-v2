package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisExecuteOutputModel
 */
public class CRCompeitorAnalysisExecuteOutputModel   {
  private CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;

  private String compeitorAnalysisExecuteActionTaskReference = null;

  private Object compeitorAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get competitorAnalysisInstanceRecord
   * @return competitorAnalysisInstanceRecord
  **/

  public CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Compeitor Analysis instance execute service call 
   * @return compeitorAnalysisExecuteActionTaskReference
  **/

  public String getCompeitorAnalysisExecuteActionTaskReference() {
    return compeitorAnalysisExecuteActionTaskReference;
  }

  public void setCompeitorAnalysisExecuteActionTaskReference(String compeitorAnalysisExecuteActionTaskReference) {
    this.compeitorAnalysisExecuteActionTaskReference = compeitorAnalysisExecuteActionTaskReference;
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

