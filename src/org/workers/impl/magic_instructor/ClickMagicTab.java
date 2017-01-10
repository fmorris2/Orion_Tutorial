package org.workers.impl.magic_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class ClickMagicTab extends TutorialWorker
{

	public ClickMagicTab(OrionTutorial mission)
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
		script.log(this, false, "Click Magic Tab");
		tabs.open(Tab.MAGIC);
	}

}
