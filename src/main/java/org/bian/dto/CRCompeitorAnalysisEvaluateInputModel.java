package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateInputModel
 */
public class CRCompeitorAnalysisEvaluateInputModel   {
  private String competitorAnalysisServicingSessionReference = null;

  private Object compeitorAnalysisEvaluateActionRecord = null;

  private String compeitorAnalysisInstanceStatus = null;

  private CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return compeitorAnalysisEvaluateActionRecord
  **/

  public Object getCompeitorAnalysisEvaluateActionRecord() {
    return compeitorAnalysisEvaluateActionRecord;
  }

  public void setCompeitorAnalysisEvaluateActionRecord(Object compeitorAnalysisEvaluateActionRecord) {
    this.compeitorAnalysisEvaluateActionRecord = compeitorAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Compeitor Analysis instance (e.g. initialised, pending, active) 
   * @return compeitorAnalysisInstanceStatus
  **/

  public String getCompeitorAnalysisInstanceStatus() {
    return compeitorAnalysisInstanceStatus;
  }

  public void setCompeitorAnalysisInstanceStatus(String compeitorAnalysisInstanceStatus) {
    this.compeitorAnalysisInstanceStatus = compeitorAnalysisInstanceStatus;
  }


  /**
   * Get competitorAnalysisInstanceRecord
   * @return competitorAnalysisInstanceRecord
  **/

  public CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


}

