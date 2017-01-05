package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class CharDesign extends TutorialWorker
{

	public CharDesign(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public void work()
	{
	}

	@Override
	public boolean shouldExecute()
	{
		return true;
	}

}
