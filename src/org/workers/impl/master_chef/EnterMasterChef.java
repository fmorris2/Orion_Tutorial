package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class EnterMasterChef extends TutorialWorker
{

	public EnterMasterChef(OrionTutorial mission)
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
		script.log(this, false, "Enter Master Chef");
	}

}
