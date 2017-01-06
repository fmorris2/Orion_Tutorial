package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.RS2Widget;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class ClickRun extends TutorialWorker
{
	private static final int INTER_MASTER = 261, INTER_CHILD = 67;
	
	public ClickRun(OrionTutorial mission)
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
		script.log(this, false, "Click run");
		if(tabs.open(Tab.SETTINGS))
		{
			RS2Widget widget = widgets.get(INTER_MASTER, INTER_CHILD);
			if(widget != null)
				widget.interact();
		}
	}

}
