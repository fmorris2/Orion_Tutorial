package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitRunescapeGuide extends TutorialWorker
{
	private static final Position EXIT_TILE = new Position(3098, 3107, 0);
	
	public ExitRunescapeGuide(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{return true;}

	@Override
	public void work()
	{
		script.log(this, false, "Exit RuneScape Guide");
		if(iFact.clickObject("Open", "Door", new Area(3096, 3109, 3099, 3105)).execute())
			Timing.waitCondition(() -> myPosition().equals(EXIT_TILE), 5000);
	}

}
