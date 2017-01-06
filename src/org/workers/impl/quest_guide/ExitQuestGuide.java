package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class ExitQuestGuide extends TutorialWorker
{

	public ExitQuestGuide(OrionTutorial mission)
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
		script.log(this, false, "Exit Quest Guide");
	}

}
