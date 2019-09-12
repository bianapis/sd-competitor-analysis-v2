package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis
 */
public class CRCompeitorAnalysisRetrieveInputModelCompeitorAnalysisInstanceAnalysis   {
  private String compeitorAnalysisInstanceAnalysisReference = null;

  private String compeitorAnalysisInstanceAnalysisReportType = null;

  private String compeitorAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return compeitorAnalysisInstanceAnalysisReference
  **/

  public String getCompeitorAnalysisInstanceAnalysisReference() {
    return compeitorAnalysisInstanceAnalysisReference;
  }

  public void setCompeitorAnalysisInstanceAnalysisReference(String compeitorAnalysisInstanceAnalysisReference) {
    this.compeitorAnalysisInstanceAnalysisReference = compeitorAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return compeitorAnalysisInstanceAnalysisParameters
  **/

  public String getCompeitorAnalysisInstanceAnalysisParameters() {
    return compeitorAnalysisInstanceAnalysisParameters;
  }

  public void setCompeitorAnalysisInstanceAnalysisParameters(String compeitorAnalysisInstanceAnalysisParameters) {
    this.compeitorAnalysisInstanceAnalysisParameters = compeitorAnalysisInstanceAnalysisParameters;
  }


}

