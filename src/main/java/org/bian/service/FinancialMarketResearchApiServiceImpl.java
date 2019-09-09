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
public class FinancialMarketResearchApiServiceImpl implements FinancialMarketResearchApiService {

	public SDFinancialMarketResearchActivateOutputModel activate(SDFinancialMarketResearchActivateInputModel request){
		return JsonReader.read("activate-SDFinancialMarketResearchActivateOutputModel.json",new TypeReference<SDFinancialMarketResearchActivateOutputModel>(){});
	}
	
	public SDFinancialMarketResearchConfigureOutputModel configure(String sdReferenceId, SDFinancialMarketResearchConfigureInputModel request){
		return JsonReader.read("configure-SDFinancialMarketResearchConfigureOutputModel.json",new TypeReference<SDFinancialMarketResearchConfigureOutputModel>(){});
	}
	
	public CRFinancialMarketResearchDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryExecuteInputModel request){
		return JsonReader.read("execute-CRFinancialMarketResearchDirectoryEntryExecuteOutputModel.json",new TypeReference<CRFinancialMarketResearchDirectoryEntryExecuteOutputModel>(){});
	}
	
	public SDFinancialMarketResearchFeedbackOutputModel feedback(String sdReferenceId, SDFinancialMarketResearchFeedbackInputModel request){
		return JsonReader.read("feedback-SDFinancialMarketResearchFeedbackOutputModel.json",new TypeReference<SDFinancialMarketResearchFeedbackOutputModel>(){});
	}
	
	public CRFinancialMarketResearchDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRFinancialMarketResearchDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRFinancialMarketResearchDirectoryEntryRegisterOutputModel.json",new TypeReference<CRFinancialMarketResearchDirectoryEntryRegisterOutputModel>(){});
	}
	
	public CRFinancialMarketResearchDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRFinancialMarketResearchDirectoryEntryRequestOutputModel.json",new TypeReference<CRFinancialMarketResearchDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel>(){});
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
	
	public SDFinancialMarketResearchRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFinancialMarketResearchRetrieveOutputModel.json",new TypeReference<SDFinancialMarketResearchRetrieveOutputModel>(){});
	}
	
	public CRFinancialMarketResearchDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRFinancialMarketResearchDirectoryEntryUpdateOutputModel.json",new TypeReference<CRFinancialMarketResearchDirectoryEntryUpdateOutputModel>(){});
	}
	
}
