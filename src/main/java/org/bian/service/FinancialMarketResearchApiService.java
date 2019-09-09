/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialMarketResearchApiService {

	SDFinancialMarketResearchActivateOutputModel activate(SDFinancialMarketResearchActivateInputModel request);
	
	SDFinancialMarketResearchConfigureOutputModel configure(String sdReferenceId, SDFinancialMarketResearchConfigureInputModel request);
	
	CRFinancialMarketResearchDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryExecuteInputModel request);
	
	SDFinancialMarketResearchFeedbackOutputModel feedback(String sdReferenceId, SDFinancialMarketResearchFeedbackInputModel request);
	
	CRFinancialMarketResearchDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRFinancialMarketResearchDirectoryEntryRegisterInputModel request);
	
	CRFinancialMarketResearchDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryRequestInputModel request);
	
	CRFinancialMarketResearchDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFinancialMarketResearchRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialMarketResearchDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketResearchDirectoryEntryUpdateInputModel request);
	
}
