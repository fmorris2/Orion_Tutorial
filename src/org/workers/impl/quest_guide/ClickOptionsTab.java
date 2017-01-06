package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class ClickOptionsTab extends TutorialWorker
{

	public ClickOptionsTab(OrionTutorial mission)
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
		script.log(this, false, "Click Options Tab");
		tabs.open(Tab.SETTINGS);
	}

}
