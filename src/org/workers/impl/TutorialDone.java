package org.workers.impl;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class TutorialDone extends TutorialWorker
{

	public TutorialDone(OrionTutorial mission)
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
	{}

}
