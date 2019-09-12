/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CompetitorAnalysisApiService {

	SDCompetitorAnalysisActivateOutputModel activate(SDCompetitorAnalysisActivateInputModel request);
	
	SDCompetitorAnalysisConfigureOutputModel configure(String sdReferenceId, SDCompetitorAnalysisConfigureInputModel request);
	
	CRCompeitorAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCompeitorAnalysisEvaluateInputModel request);
	
	CRCompeitorAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCompeitorAnalysisExecuteInputModel request);
	
	SDCompetitorAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDCompetitorAnalysisFeedbackInputModel request);
	
	CRCompeitorAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCompeitorAnalysisRequestInputModel request);
	
	CRCompeitorAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCompetitorAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
