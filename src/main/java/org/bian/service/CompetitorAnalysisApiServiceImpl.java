/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CompetitorAnalysisApiServiceImpl implements CompetitorAnalysisApiService {

	public SDCompetitorAnalysisActivateOutputModel activate(SDCompetitorAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDCompetitorAnalysisActivateOutputModel.json",new TypeReference<SDCompetitorAnalysisActivateOutputModel>(){});
	}
	
	public SDCompetitorAnalysisConfigureOutputModel configure(String sdReferenceId, SDCompetitorAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDCompetitorAnalysisConfigureOutputModel.json",new TypeReference<SDCompetitorAnalysisConfigureOutputModel>(){});
	}
	
	public CRCompeitorAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCompeitorAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCompeitorAnalysisEvaluateOutputModel.json",new TypeReference<CRCompeitorAnalysisEvaluateOutputModel>(){});
	}
	
	public CRCompeitorAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCompeitorAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRCompeitorAnalysisExecuteOutputModel.json",new TypeReference<CRCompeitorAnalysisExecuteOutputModel>(){});
	}
	
	public SDCompetitorAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDCompetitorAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDCompetitorAnalysisFeedbackOutputModel.json",new TypeReference<SDCompetitorAnalysisFeedbackOutputModel>(){});
	}
	
	public CRCompeitorAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCompeitorAnalysisRequestInputModel request){
		return JsonReader.read("request-CRCompeitorAnalysisRequestOutputModel.json",new TypeReference<CRCompeitorAnalysisRequestOutputModel>(){});
	}
	
	public CRCompeitorAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCompeitorAnalysisRetrieveOutputModel.json",new TypeReference<CRCompeitorAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCompetitorAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCompetitorAnalysisRetrieveOutputModel.json",new TypeReference<SDCompetitorAnalysisRetrieveOutputModel>(){});
	}
	
}
