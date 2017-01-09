package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitMiningInstructor extends TutorialWorker
{

	public ExitMiningInstructor(OrionTutorial mission)
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
		script.log(this, false, "Exit Mining Instructor");
		if(iFact.clickObject("Open", "Gate", 25).execute())
			Timing.waitCondition(() -> myPosition().getX() > 3094, 7500);
	}

}
