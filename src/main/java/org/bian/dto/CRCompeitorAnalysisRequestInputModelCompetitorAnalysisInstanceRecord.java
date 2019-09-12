package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord;
import org.bian.dto.CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord
 */
public class CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecord   {
  private CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord = null;

  private CRCompeitorAnalysisEvaluateInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisUsageRecord competitorAnalysisUsageRecord = null;


  /**
   * Get competitorAnalysisRequestRecord
   * @return competitorAnalysisRequestRecord
  **/

  public CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord getCompetitorAnalysisRequestRecord() {
    return competitorAnalysisRequestRecord;
  }

  public void setCompetitorAnalysisRequestRecord(CRCompeitorAnalysisRequestInputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord) {
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

