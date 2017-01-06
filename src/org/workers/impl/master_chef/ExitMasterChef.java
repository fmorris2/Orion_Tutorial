package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitMasterChef extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(3071, 3092, 3074, 3088);
	private static final Position EXIT_POS = new Position(3072, 3090, 0);
	
	public ExitMasterChef(OrionTutorial mission)
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
		script.log(this, false, "Exit Master Chef");
		if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(EXIT_POS), 6000);
	}

}
