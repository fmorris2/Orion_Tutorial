package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class SmeltOre extends TutorialWorker
{
	public SmeltOre(OrionTutorial mission)
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
		script.log(this, false, "Smelt ore");
		
		if(iFact.itemOnObj("Copper ore", "Furnace", 5).execute())
			Timing.waitCondition(() -> inventory.contains("Bronze bar"), 5000);
	}

}
