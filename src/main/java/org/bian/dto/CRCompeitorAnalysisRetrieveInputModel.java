package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis;
import org.bian.dto.CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveInputModel
 */
public class CRCompeitorAnalysisRetrieveInputModel   {
  private Object compeitorAnalysisRetrieveActionTaskRecord = null;

  private String compeitorAnalysisRetrieveActionRequest = null;

  private CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord compeitorAnalysisInstanceReportRecord = null;

  private CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis compeitorAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return compeitorAnalysisRetrieveActionRequest
  **/

  public String getCompeitorAnalysisRetrieveActionRequest() {
    return compeitorAnalysisRetrieveActionRequest;
  }

  public void setCompeitorAnalysisRetrieveActionRequest(String compeitorAnalysisRetrieveActionRequest) {
    this.compeitorAnalysisRetrieveActionRequest = compeitorAnalysisRetrieveActionRequest;
  }


  /**
   * Get compeitorAnalysisInstanceReportRecord
   * @return compeitorAnalysisInstanceReportRecord
  **/

  public CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord getCompeitorAnalysisInstanceReportRecord() {
    return compeitorAnalysisInstanceReportRecord;
  }

  public void setCompeitorAnalysisInstanceReportRecord(CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord compeitorAnalysisInstanceReportRecord) {
    this.compeitorAnalysisInstanceReportRecord = compeitorAnalysisInstanceReportRecord;
  }


  /**
   * Get compeitorAnalysisInstanceAnalysis
   * @return compeitorAnalysisInstanceAnalysis
  **/

  public CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis getCompeitorAnalysisInstanceAnalysis() {
    return compeitorAnalysisInstanceAnalysis;
  }

  public void setCompeitorAnalysisInstanceAnalysis(CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis compeitorAnalysisInstanceAnalysis) {
    this.compeitorAnalysisInstanceAnalysis = compeitorAnalysisInstanceAnalysis;
  }


}

