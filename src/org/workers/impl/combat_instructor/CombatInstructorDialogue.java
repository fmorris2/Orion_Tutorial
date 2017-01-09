package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class CombatInstructorDialogue extends TutorialWorker
{

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
		iFact.dialogue("Talk-to", "Combat Instructor", 20).execute();
	}

}
