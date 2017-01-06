package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class EnterMasterChef extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(3077, 3086, 3080, 3082);
	private static final Position ENTRY_POS = new Position(3078, 3084, 0);
	
	public EnterMasterChef(OrionTutorial mission)
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
		script.log(this, false, "Enter Master Chef");
		
		if(myPosition().equals(ENTRY_POS))
			return;
		
		if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(ENTRY_POS), 6500);
	}

}
