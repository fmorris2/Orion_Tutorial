package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class MakeDough extends TutorialWorker
{

	public MakeDough(OrionTutorial mission)
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
		script.log(this, false, "Make dough");
		if(itemUtils.itemOnItem("Pot of flour", "Bucket of water") && Timing.waitCondition(() -> inventory.contains("Bread dough"), 3500))
		{
			if(mission.ORION_MAIN != null)
				mission.ORION_MAIN.receiveCommand("kill");
		}
	}

}
