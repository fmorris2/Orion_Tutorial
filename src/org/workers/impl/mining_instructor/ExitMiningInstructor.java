package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitMiningInstructor extends TutorialWorker
{
	private static final Position GATE_POS = new Position(3092, 9502, 0);
	private static final int DIST_THRESH = 2;
	
	public ExitMiningInstructor(OrionTutorial mission)
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
		script.log(this, false, "Exit Mining Instructor");
		if(iFact.clickObject("Open", "Gate", 25).execute())
			Timing.waitCondition(() -> myPosition().getX() > 3094, 7500);
		else if(myPosition().distance(GATE_POS) > DIST_THRESH)
			walkUtils.walkTo(GATE_POS);
	}

}
