package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

public class OpenMusicTab extends TutorialWorker
{

	public OpenMusicTab(OrionTutorial mission)
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
		script.log(this, false, "Open Music Tab");
		tabs.open(Tab.MUSIC);
	}

}
