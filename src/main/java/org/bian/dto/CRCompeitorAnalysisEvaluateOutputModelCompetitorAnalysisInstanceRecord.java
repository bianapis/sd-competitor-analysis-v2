package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord;
import org.bian.dto.CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord
 */
public class CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecord   {
  private String competitorAnalysisType = null;

  private String competitorAnalysisSpecification = null;

  private String competitorAnalysisGuidance = null;

  private String competitorAnalysisAlgorithmReference = null;

  private CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord = null;

  private CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord competitorAnalysisUsageRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of research view provided by the research (e.g. pricing comparison) 
   * @return competitorAnalysisType
  **/

  public String getCompetitorAnalysisType() {
    return competitorAnalysisType;
  }

  public void setCompetitorAnalysisType(String competitorAnalysisType) {
    this.competitorAnalysisType = competitorAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of the specific competitor analysis 
   * @return competitorAnalysisSpecification
  **/

  public String getCompetitorAnalysisSpecification() {
    return competitorAnalysisSpecification;
  }

  public void setCompetitorAnalysisSpecification(String competitorAnalysisSpecification) {
    this.competitorAnalysisSpecification = competitorAnalysisSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidance on usage and interpretation of the competitor analysis (e.g. qualifying the accuracy/confidence of any findings) 
   * @return competitorAnalysisGuidance
  **/

  public String getCompetitorAnalysisGuidance() {
    return competitorAnalysisGuidance;
  }

  public void setCompetitorAnalysisGuidance(String competitorAnalysisGuidance) {
    this.competitorAnalysisGuidance = competitorAnalysisGuidance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the algorithm/approach used to generate the analysis 
   * @return competitorAnalysisAlgorithmReference
  **/

  public String getCompetitorAnalysisAlgorithmReference() {
    return competitorAnalysisAlgorithmReference;
  }

  public void setCompetitorAnalysisAlgorithmReference(String competitorAnalysisAlgorithmReference) {
    this.competitorAnalysisAlgorithmReference = competitorAnalysisAlgorithmReference;
  }


  /**
   * Get competitorAnalysisRequestRecord
   * @return competitorAnalysisRequestRecord
  **/

  public CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord getCompetitorAnalysisRequestRecord() {
    return competitorAnalysisRequestRecord;
  }

  public void setCompetitorAnalysisRequestRecord(CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord) {
    this.competitorAnalysisRequestRecord = competitorAnalysisRequestRecord;
  }


  /**
   * Get competitorAnalysisUsageRecord
   * @return competitorAnalysisUsageRecord
  **/

  public CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord getCompetitorAnalysisUsageRecord() {
    return competitorAnalysisUsageRecord;
  }

  public void setCompetitorAnalysisUsageRecord(CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord competitorAnalysisUsageRecord) {
    this.competitorAnalysisUsageRecord = competitorAnalysisUsageRecord;
  }


}

