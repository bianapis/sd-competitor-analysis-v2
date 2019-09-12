package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateOutputModel
 */
public class CRCompeitorAnalysisEvaluateOutputModel   {
  private String compeitorAnalysisInstanceReference = null;

  private String compeitorAnalysisEvaluateActionReference = null;

  private Object compeitorAnalysisEvaluateActionRecord = null;

  private String compeitorAnalysisInstanceStatus = null;

  private CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return compeitorAnalysisEvaluateActionReference
  **/

  public String getCompeitorAnalysisEvaluateActionReference() {
    return compeitorAnalysisEvaluateActionReference;
  }

  public void setCompeitorAnalysisEvaluateActionReference(String compeitorAnalysisEvaluateActionReference) {
    this.compeitorAnalysisEvaluateActionReference = compeitorAnalysisEvaluateActionReference;
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

  public CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


}

