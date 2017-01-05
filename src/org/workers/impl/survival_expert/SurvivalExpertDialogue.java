package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class SurvivalExpertDialogue extends TutorialWorker
{

	public SurvivalExpertDialogue(OrionTutorial mission)
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
		script.log(this, false, "Talk to Survival Expert");
		
		if(!settings.isRunning())
			settings.setRunning(true);
		
		iFact.dialogue("Talk-to", "Survival Expert", 20).execute();
	}

}
