package org.workers.impl.brother_brace;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenIgnoreTab extends TutorialWorker
{

	public OpenIgnoreTab(OrionTutorial mission)
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
		script.log(this, false, "Open Ignore Tab");
		tabs.open(Tab.IGNORES);
	}

}
