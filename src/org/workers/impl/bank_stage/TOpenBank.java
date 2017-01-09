package org.workers.impl.bank_stage;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class TOpenBank extends TutorialWorker
{

	public TOpenBank(OrionTutorial mission)
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
		script.log(this, false, "Open Bank");
	}

}
