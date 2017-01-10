package org.workers.impl.brother_brace;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitBrotherBrace extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(new Position(3121, 3103, 0), new Position(3123, 3101, 0));
	private static final Position EXIT_POS = new Position(3122, 3102, 0);
	
	public ExitBrotherBrace(OrionTutorial mission)
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
		script.log(this, false, "Exit Brother Brace");
		if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(EXIT_POS), 5000);
		
	}

}
