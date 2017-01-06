package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitQuestGuide extends TutorialWorker
{
	private static final Area LADDER_AREA = new Area(3087, 3120, 3089, 3118);
	
	
	public ExitQuestGuide(OrionTutorial mission)
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
		script.log(this, false, "Exit Quest Guide");
		if(iFact.clickObject("Climb-down", "Ladder", LADDER_AREA).execute())
			Timing.waitCondition(() -> myPosition().getY() > 9000, 4500);
	}

}
