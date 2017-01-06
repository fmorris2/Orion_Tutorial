package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenQuestTab extends TutorialWorker
{

	public OpenQuestTab(OrionTutorial mission)
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
		script.log(this, false, "Open Quest Tab");
		tabs.open(Tab.QUEST);
	}

}
