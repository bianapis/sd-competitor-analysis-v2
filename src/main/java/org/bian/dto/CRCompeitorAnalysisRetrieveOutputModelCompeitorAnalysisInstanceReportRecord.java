package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord
 */
public class CRCompeitorAnalysisRetrieveOutputModelCompeitorAnalysisInstanceReportRecord   {
  private String compeitorAnalysisInstanceReportData = null;

  private String compeitorAnalysisInstanceReportType = null;

  private Object compeitorAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return compeitorAnalysisInstanceReportData
  **/

  public String getCompeitorAnalysisInstanceReportData() {
    return compeitorAnalysisInstanceReportData;
  }

  public void setCompeitorAnalysisInstanceReportData(String compeitorAnalysisInstanceReportData) {
    this.compeitorAnalysisInstanceReportData = compeitorAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return compeitorAnalysisInstanceReportType
  **/

  public String getCompeitorAnalysisInstanceReportType() {
    return compeitorAnalysisInstanceReportType;
  }

  public void setCompeitorAnalysisInstanceReportType(String compeitorAnalysisInstanceReportType) {
    this.compeitorAnalysisInstanceReportType = compeitorAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return compeitorAnalysisInstanceReport
  **/

  public Object getCompeitorAnalysisInstanceReport() {
    return compeitorAnalysisInstanceReport;
  }

  public void setCompeitorAnalysisInstanceReport(Object compeitorAnalysisInstanceReport) {
    this.compeitorAnalysisInstanceReport = compeitorAnalysisInstanceReport;
  }


}

