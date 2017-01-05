package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class TutorialChopTree extends TutorialWorker
{

	public TutorialChopTree(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{
		return !inventory.contains("Logs");
	}

	@Override
	public void work()
	{
		script.log(this, false, "Chopping tree");
		if(iFact.clickObject("Chop down", "Tree", 15).execute() && Timing.waitCondition(() -> myPlayer().isAnimating(), 3500))
			Timing.waitCondition(() -> inventory.contains("Logs"), 6500);
	}

}
