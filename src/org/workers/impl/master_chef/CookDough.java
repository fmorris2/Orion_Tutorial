package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CookDough extends TutorialWorker
{

	public CookDough(OrionTutorial mission)
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
		script.log(this, false, "Cook dough");
		if(iFact.itemOnObj("Bread dough", "Range", 12).execute())
			Timing.waitCondition(() -> inventory.contains("Bread"), 3500);
	}

}
