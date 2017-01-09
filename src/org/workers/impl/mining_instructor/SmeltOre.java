package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class SmeltOre extends TutorialWorker
{
	private static final Position SMELT_POS = new Position(3079, 9497, 0);
	
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
		
		if(!myPosition().equals(SMELT_POS))
			walkUtils.walkTo(SMELT_POS);
		else if(iFact.itemOnObj("Copper ore", "Furnace", 5).execute())
			Timing.waitCondition(() -> inventory.contains("Bronze bar"), 5000);
	}

}
