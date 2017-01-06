package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class ExitSurvivalExpert extends TutorialWorker
{

	public ExitSurvivalExpert(OrionTutorial mission)
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
		script.log(this, false, "Exit Survival Expert");
	}

}
