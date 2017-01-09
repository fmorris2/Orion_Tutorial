package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitCombatInstructor extends TutorialWorker
{
	private static final Area LADDER_AREA = new Area(3107, 9528, 3112, 9520);
	
	public ExitCombatInstructor(OrionTutorial mission)
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
		script.log(this, false, "Exit Combat Instructor");
		final int CONF_CACHE = configs.get(TutorialState.CONFIG_ID);
		
		if(iFact.clickObject("Climb-up", "Ladder", LADDER_AREA).execute())
			Timing.waitCondition(() -> configs.get(TutorialState.CONFIG_ID) != CONF_CACHE, 7500);
	}

}
