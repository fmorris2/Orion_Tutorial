package org.workers;

import org.OrionTutorial;

import viking.framework.worker.Worker;

public abstract class TutorialWorker extends Worker<OrionTutorial>
{

	public TutorialWorker(OrionTutorial mission)
	{
		super(mission);
	}
	
	public abstract boolean shouldExecute();

	@Override
	public boolean needsRepeat()
	{return false;};
}
