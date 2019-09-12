package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord
 */
public class CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceReportRecord   {
  private String compeitorAnalysisInstanceReportReference = null;

  private String compeitorAnalysisInstanceReportType = null;

  private String compeitorAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return compeitorAnalysisInstanceReportReference
  **/

  public String getCompeitorAnalysisInstanceReportReference() {
    return compeitorAnalysisInstanceReportReference;
  }

  public void setCompeitorAnalysisInstanceReportReference(String compeitorAnalysisInstanceReportReference) {
    this.compeitorAnalysisInstanceReportReference = compeitorAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return compeitorAnalysisInstanceReportParameters
  **/

  public String getCompeitorAnalysisInstanceReportParameters() {
    return compeitorAnalysisInstanceReportParameters;
  }

  public void setCompeitorAnalysisInstanceReportParameters(String compeitorAnalysisInstanceReportParameters) {
    this.compeitorAnalysisInstanceReportParameters = compeitorAnalysisInstanceReportParameters;
  }


}

