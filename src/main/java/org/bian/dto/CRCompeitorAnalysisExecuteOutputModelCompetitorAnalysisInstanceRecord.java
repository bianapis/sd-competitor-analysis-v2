package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord;

import javax.validation.Valid;
  
/**
 * CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord
 */
public class CRCompeitorAnalysisExecuteOutputModelCompetitorAnalysisInstanceRecord   {
  private CRCompeitorAnalysisEvaluateOutputModelCompetitorAnalysisInstanceRecordCompetitorAnalysisRequestRecord competitorAnalysisRequestRecord = null;


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


}

