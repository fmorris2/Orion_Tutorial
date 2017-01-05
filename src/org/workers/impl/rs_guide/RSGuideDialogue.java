package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class RSGuideDialogue extends TutorialWorker
{

	public RSGuideDialogue(OrionTutorial mission)
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
