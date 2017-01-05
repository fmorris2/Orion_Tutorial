package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class ClickOptionsTab extends TutorialWorker
{

	public ClickOptionsTab(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{return true;}

	@Override
	public void work()
	{
		settings.open();
	}

}
