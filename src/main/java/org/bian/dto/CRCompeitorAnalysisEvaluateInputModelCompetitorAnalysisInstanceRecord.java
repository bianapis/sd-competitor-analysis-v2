package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord;
import org.bian.dto.CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord
 */
public class CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecord   {
  private String competitorAnalysisType = null;

  private String competitorAnalysisAlgorithmReference = null;

  private CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord = null;

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

  public CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord getCompetitorAnalysisRequestRecord() {
    return competitorAnalysisRequestRecord;
  }

  public void setCompetitorAnalysisRequestRecord(CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord) {
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

