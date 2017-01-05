package org.workers.impl.survival_expert;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenSkillsTab extends TutorialWorker
{

	public OpenSkillsTab(OrionTutorial mission)
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
		script.log(this, false, "Open skills tab");
		tabs.open(Tab.SKILLS);
	}

}
