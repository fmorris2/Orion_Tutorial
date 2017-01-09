package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CombatInstructorDialogue extends TutorialWorker
{
	private static final Position REACHABLE_POS = new Position(3107, 9508, 0);
	
	public CombatInstructorDialogue(OrionTutorial mission)
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
		script.log(this, false, "Combat Instructor Dialogue");
		
		if(map.canReach(REACHABLE_POS))
			iFact.dialogue("Talk-to", "Combat Instructor", 20).execute();
		else if(iFact.clickObject("Open", "Gate", EnterRatCage.GATE_AREA).execute())
			Timing.waitCondition(() -> map.canReach(REACHABLE_POS), 5500);
	}

}
