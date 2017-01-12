package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

public class MiningInstructorDialogue extends TutorialWorker
{
	private static final Position INSTRUCTOR_POS = new Position(3082, 9504, 0);
	private static final int DIST_THRESH = 8;
	
	public MiningInstructorDialogue(OrionTutorial mission)
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
		script.log(this, false, "Mining Instructor Dialogue");
		
		if(myPosition().getY() < 9000) //up ladder
			iFact.clickObject("Climb-down", "Ladder", 10).execute();
		
		if(!iFact.dialogue("Talk-to", "Mining Instructor", 25).execute()
				&& myPosition().distance(INSTRUCTOR_POS) > DIST_THRESH)
			walkUtils.walkTo(INSTRUCTOR_POS);
	}

}
