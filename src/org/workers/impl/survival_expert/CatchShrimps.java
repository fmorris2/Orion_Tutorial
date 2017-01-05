package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CatchShrimps extends TutorialWorker
{

	public CatchShrimps(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{
		script.log(this, false, "Amount of Raw shrimps: " + inventory.getAmount("Raw shrimps"));
		return inventory.getAmount("Raw shrimps") < 2;
	}

	@Override
	public void work()
	{
		script.log(this, false, "Catch shrimps");
		
		int invAmt = inventory.getEmptySlots();
		
		if(iFact.clickNpc("Net", "Fishing spot", 15).execute() && Timing.waitCondition(() -> myPlayer().isAnimating(), 5500))
			Timing.waitCondition(() -> invAmt != inventory.getEmptySlots(), 5000);
	}

}
