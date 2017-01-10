package org.workers.impl.financial_advisor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitFinancialAdvisor extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(new Position(3129, 3126, 0), new Position(3131, 3123, 0));
	private static final Position EXIT_POS = new Position(3130, 3124, 0);
	
	public ExitFinancialAdvisor(OrionTutorial mission)
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
		script.log(this, false, "Exit Financial Advisor");
		if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(EXIT_POS), 3500);	
	}

}
