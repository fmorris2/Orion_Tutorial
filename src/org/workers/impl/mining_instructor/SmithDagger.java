package org.workers.impl.mining_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.RS2Widget;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class SmithDagger extends TutorialWorker
{
	private static final int SMITH_MASTER = 312, DAGGER_CHILD = 2;
	
	public SmithDagger(OrionTutorial mission)
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
		script.log(this, false, "Smith Dagger");
		RS2Widget widget = widgets.get(SMITH_MASTER, DAGGER_CHILD);
		if(widget == null)
		{
			if(iFact.clickObject("Smith", "Anvil", 10).execute())
			Timing.waitCondition(() -> widgets.get(SMITH_MASTER, DAGGER_CHILD) != null, 5500);
		}
		else if(widget.interact())
			Timing.waitCondition(() -> inventory.contains("Bronze dagger"), 5000);
	}

}
