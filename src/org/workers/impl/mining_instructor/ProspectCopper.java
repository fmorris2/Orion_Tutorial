package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ProspectCopper extends TutorialWorker
{
	private static final Area COPPER_AREA = new Area(3081, 9497, 3095, 9505);
	
	public ProspectCopper(OrionTutorial mission)
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
		script.log(this, false, "Prospect Copper");
		int confCache = configs.get(TutorialState.CONFIG_ID);
		
		if(iFact.clickObject("Prospect", "Rocks", COPPER_AREA).execute())
			Timing.waitCondition(() -> configs.get(TutorialState.CONFIG_ID) != confCache, 5000);
	}

}
