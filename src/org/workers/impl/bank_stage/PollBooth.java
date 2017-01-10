package org.workers.impl.bank_stage;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class PollBooth extends TutorialWorker
{

	public PollBooth(OrionTutorial mission)
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
		script.log(this, false, "Poll booth");
		
		if(bank.isOpen())
			bank.close();
		else if(!dialogues.isPendingContinuation() && iFact.clickObject("Use", "Poll booth", 15).execute())
			Timing.waitCondition(() -> dialogues.isPendingContinuation(), 4500);
	}

}
