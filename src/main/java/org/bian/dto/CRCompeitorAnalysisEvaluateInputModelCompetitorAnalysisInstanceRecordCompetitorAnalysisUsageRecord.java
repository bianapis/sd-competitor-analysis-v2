package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord
 */
public class CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord   {
  private String competitorAnalysisUsage = null;

  private String competitorAnalysisImpact = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the usage of the analysis 
   * @return competitorAnalysisUsage
  **/

  public String getCompetitorAnalysisUsage() {
    return competitorAnalysisUsage;
  }

  public void setCompetitorAnalysisUsage(String competitorAnalysisUsage) {
    this.competitorAnalysisUsage = competitorAnalysisUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of reported impact/accuracy of the competitor analysis 
   * @return competitorAnalysisImpact
  **/

  public String getCompetitorAnalysisImpact() {
    return competitorAnalysisImpact;
  }

  public void setCompetitorAnalysisImpact(String competitorAnalysisImpact) {
    this.competitorAnalysisImpact = competitorAnalysisImpact;
  }


}

