package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CookShrimps extends TutorialWorker
{

	public CookShrimps(OrionTutorial mission)
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
		script.log(this, false, "Cook shrimps");
		long invAmt = inventory.getAmount("Raw shrimps");
		
		if(iFact.itemOnObj("Raw shrimps", "Fire", 15).execute())
			Timing.waitCondition(() -> inventory.getAmount("Raw shrimps") != invAmt, 6500);
	} 

}
