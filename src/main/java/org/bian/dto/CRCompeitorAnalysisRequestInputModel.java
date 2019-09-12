package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord;
import org.bian.dto.CRCompeitorAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRequestInputModel
 */
public class CRCompeitorAnalysisRequestInputModel   {
  private String competitorAnalysisServicingSessionReference = null;

  private String compeitorAnalysisInstanceReference = null;

  private CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;

  private Object compeitorAnalysisRequestActionTaskRecord = null;

  private CRCompeitorAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCompeitorAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCompeitorAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

