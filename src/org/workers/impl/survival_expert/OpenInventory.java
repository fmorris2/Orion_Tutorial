package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenInventory extends TutorialWorker
{

	public OpenInventory(OrionTutorial mission)
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
		script.log(this, false, "Opening inventory");
		tabs.open(Tab.INVENTORY);
	}

}
