package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitSurvivalExpert extends TutorialWorker
{
	private static final Area GATE_AREA = new Area(3088, 3095, 3092, 3089);
	
	public ExitSurvivalExpert(OrionTutorial mission)
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
		script.log(this, false, "Exit Survival Expert");
		if(iFact.clickObject("Open", "Gate", GATE_AREA).execute())
			Timing.waitCondition(() -> myPosition().getX() > 3090, 6500);
	}

}
