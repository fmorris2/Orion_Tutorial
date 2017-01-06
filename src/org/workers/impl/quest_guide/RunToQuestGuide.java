package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class RunToQuestGuide extends TutorialWorker
{

	public RunToQuestGuide(OrionTutorial mission)
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
		script.log(this, false, "Run to quest guide");
	}

}
