package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis;
import org.bian.dto.CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord;
import org.bian.dto.CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveOutputModel
 */
public class CRCompeitorAnalysisRetrieveOutputModel   {
  private CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord = null;

  private String compeitorAnalysisRetrieveActionTaskReference = null;

  private Object compeitorAnalysisRetrieveActionTaskRecord = null;

  private String compeitorAnalysisRetrieveActionResponse = null;

  private CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord compeitorAnalysisInstanceReportRecord = null;

  private CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis compeitorAnalysisInstanceAnalysis = null;


  /**
   * Get competitorAnalysisInstanceRecord
   * @return competitorAnalysisInstanceRecord
  **/

  public CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecord getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecord competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Compeitor Analysis instance retrieve service call 
   * @return compeitorAnalysisRetrieveActionTaskReference
  **/

  public String getCompeitorAnalysisRetrieveActionTaskReference() {
    return compeitorAnalysisRetrieveActionTaskReference;
  }

  public void setCompeitorAnalysisRetrieveActionTaskReference(String compeitorAnalysisRetrieveActionTaskReference) {
    this.compeitorAnalysisRetrieveActionTaskReference = compeitorAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return compeitorAnalysisRetrieveActionTaskRecord
  **/

  public Object getCompeitorAnalysisRetrieveActionTaskRecord() {
    return compeitorAnalysisRetrieveActionTaskRecord;
  }

  public void setCompeitorAnalysisRetrieveActionTaskRecord(Object compeitorAnalysisRetrieveActionTaskRecord) {
    this.compeitorAnalysisRetrieveActionTaskRecord = compeitorAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return compeitorAnalysisRetrieveActionResponse
  **/

  public String getCompeitorAnalysisRetrieveActionResponse() {
    return compeitorAnalysisRetrieveActionResponse;
  }

  public void setCompeitorAnalysisRetrieveActionResponse(String compeitorAnalysisRetrieveActionResponse) {
    this.compeitorAnalysisRetrieveActionResponse = compeitorAnalysisRetrieveActionResponse;
  }


  /**
   * Get compeitorAnalysisInstanceReportRecord
   * @return compeitorAnalysisInstanceReportRecord
  **/

  public CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord getCompeitorAnalysisInstanceReportRecord() {
    return compeitorAnalysisInstanceReportRecord;
  }

  public void setCompeitorAnalysisInstanceReportRecord(CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord compeitorAnalysisInstanceReportRecord) {
    this.compeitorAnalysisInstanceReportRecord = compeitorAnalysisInstanceReportRecord;
  }


  /**
   * Get compeitorAnalysisInstanceAnalysis
   * @return compeitorAnalysisInstanceAnalysis
  **/

  public CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis getCompeitorAnalysisInstanceAnalysis() {
    return compeitorAnalysisInstanceAnalysis;
  }

  public void setCompeitorAnalysisInstanceAnalysis(CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis compeitorAnalysisInstanceAnalysis) {
    this.compeitorAnalysisInstanceAnalysis = compeitorAnalysisInstanceAnalysis;
  }


}

