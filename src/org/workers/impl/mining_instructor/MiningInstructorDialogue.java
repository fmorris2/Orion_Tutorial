package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class MiningInstructorDialogue extends TutorialWorker
{

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
		
		iFact.dialogue("Talk-to", "Mining Instructor", 25).execute();
	}

}
