package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRequestOutputModel
 */
public class CRCompeitorAnalysisRequestOutputModel   {
  private CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;

  private String compeitorAnalysisRequestActionTaskReference = null;

  private Object compeitorAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Compeitor Analysis instance request service call 
   * @return compeitorAnalysisRequestActionTaskReference
  **/

  public String getCompeitorAnalysisRequestActionTaskReference() {
    return compeitorAnalysisRequestActionTaskReference;
  }

  public void setCompeitorAnalysisRequestActionTaskReference(String compeitorAnalysisRequestActionTaskReference) {
    this.compeitorAnalysisRequestActionTaskReference = compeitorAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return compeitorAnalysisRequestActionTaskRecord
  **/

  public Object getCompeitorAnalysisRequestActionTaskRecord() {
    return compeitorAnalysisRequestActionTaskRecord;
  }

  public void setCompeitorAnalysisRequestActionTaskRecord(Object compeitorAnalysisRequestActionTaskRecord) {
    this.compeitorAnalysisRequestActionTaskRecord = compeitorAnalysisRequestActionTaskRecord;
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

