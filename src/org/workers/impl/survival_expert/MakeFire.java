package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class MakeFire extends TutorialWorker
{

	public MakeFire(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{
		return inventory.contains("Logs");
	}

	@Override
	public void work()
	{
		script.log(this, false, "Make fire");
	}

}
