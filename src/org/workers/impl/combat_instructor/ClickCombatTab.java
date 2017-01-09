package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class ClickCombatTab extends TutorialWorker
{

	public ClickCombatTab(OrionTutorial mission)
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
		script.log(this, false, "Click Combat Tab");
		tabs.open(Tab.ATTACK);
	}

}
