package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis
 */
public class CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceAnalysis   {
  private String compeitorAnalysisInstanceAnalysisData = null;

  private String compeitorAnalysisInstanceAnalysisReportType = null;

  private Object compeitorAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return compeitorAnalysisInstanceAnalysisData
  **/

  public String getCompeitorAnalysisInstanceAnalysisData() {
    return compeitorAnalysisInstanceAnalysisData;
  }

  public void setCompeitorAnalysisInstanceAnalysisData(String compeitorAnalysisInstanceAnalysisData) {
    this.compeitorAnalysisInstanceAnalysisData = compeitorAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return compeitorAnalysisInstanceAnalysisReportType
  **/

  public String getCompeitorAnalysisInstanceAnalysisReportType() {
    return compeitorAnalysisInstanceAnalysisReportType;
  }

  public void setCompeitorAnalysisInstanceAnalysisReportType(String compeitorAnalysisInstanceAnalysisReportType) {
    this.compeitorAnalysisInstanceAnalysisReportType = compeitorAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return compeitorAnalysisInstanceAnalysisReport
  **/

  public Object getCompeitorAnalysisInstanceAnalysisReport() {
    return compeitorAnalysisInstanceAnalysisReport;
  }

  public void setCompeitorAnalysisInstanceAnalysisReport(Object compeitorAnalysisInstanceAnalysisReport) {
    this.compeitorAnalysisInstanceAnalysisReport = compeitorAnalysisInstanceAnalysisReport;
  }


}

