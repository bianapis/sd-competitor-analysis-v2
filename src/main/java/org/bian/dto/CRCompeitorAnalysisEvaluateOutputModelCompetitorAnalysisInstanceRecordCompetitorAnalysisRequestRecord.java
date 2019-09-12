package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord
 */
public class CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord   {
  private String competitorAnalysisRequestWorkProducts = null;

  private String competitorAnalysisRequestResult = null;


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

