package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord
 */
public class CRCompeitorAnalysisRetrieveOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord   {
  private String competitorAnalysisRequest = null;

  private String employeeBusinessUnitReference = null;

  private String competitorAnalysisRequestWorkProducts = null;

  private String competitorAnalysisRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific details of the request 
   * @return competitorAnalysisRequest
  **/

  public String getCompetitorAnalysisRequest() {
    return competitorAnalysisRequest;
  }

  public void setCompetitorAnalysisRequest(String competitorAnalysisRequest) {
    this.competitorAnalysisRequest = competitorAnalysisRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The employee/business unit requesting the analysis 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return competitorAnalysisRequestWorkProducts
  **/

  public String getCompetitorAnalysisRequestWorkProducts() {
    return competitorAnalysisRequestWorkProducts;
  }

  public void setCompetitorAnalysisRequestWorkProducts(String competitorAnalysisRequestWorkProducts) {
    this.competitorAnalysisRequestWorkProducts = competitorAnalysisRequestWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from performing the analysis 
   * @return competitorAnalysisRequestResult
  **/

  public String getCompetitorAnalysisRequestResult() {
    return competitorAnalysisRequestResult;
  }

  public void setCompetitorAnalysisRequestResult(String competitorAnalysisRequestResult) {
    this.competitorAnalysisRequestResult = competitorAnalysisRequestResult;
  }


}

