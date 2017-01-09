package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class EnterRatCage extends TutorialWorker
{
	public static final Area GATE_AREA = new Area(3108, 9521, 3112, 9516);
	
	public EnterRatCage(OrionTutorial mission)
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
		script.log(this, false, "Enter Rat Cage");
		final int CONF_CACHE = configs.get(TutorialState.CONFIG_ID);
		
		if(iFact.clickObject("Open", "Gate", GATE_AREA).execute())
			Timing.waitCondition(() -> configs.get(TutorialState.CONFIG_ID) != CONF_CACHE, 7500);
	}

}
