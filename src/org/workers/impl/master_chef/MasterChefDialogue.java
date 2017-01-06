package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class MasterChefDialogue extends TutorialWorker
{

	public MasterChefDialogue(OrionTutorial mission)
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
		script.log(this, false, "Master Chef dialogue");
		if(iFact.dialogue("Talk-to", "Master Chef", 10).execute())
			Timing.waitCondition(() -> inventory.contains("Pot of flour"), 3500);
	}

}
