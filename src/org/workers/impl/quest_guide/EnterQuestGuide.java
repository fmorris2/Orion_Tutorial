package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class EnterQuestGuide extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(3084, 3127, 3087, 3123);
	private static final Position ENTER_POS = new Position(3086, 3125, 0);
	
	public EnterQuestGuide(OrionTutorial mission)
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
		script.log(this, false, "Run to quest guide");
		if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(ENTER_POS), 6500);
	}

}
