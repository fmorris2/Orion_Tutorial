package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenEquipmentTab extends TutorialWorker
{

	public OpenEquipmentTab(OrionTutorial mission)
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
		script.log(this, false, "Open Equipment Tab");
		tabs.open(Tab.EQUIPMENT);
	}

}
