package org.workers.impl.financial_advisor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class FinancialAdvisorDialogue extends TutorialWorker
{

	public FinancialAdvisorDialogue(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{
		return true;
	}

	@Override
	public void work()
	{
		script.log(this, false, "Financial Advisor Dialogue");
		iFact.dialogue("Talk-to", "Financial Advisor", 7).execute();
	}

}
