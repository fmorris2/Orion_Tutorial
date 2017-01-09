package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class EnterRatCage extends TutorialWorker
{

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
	}

}
