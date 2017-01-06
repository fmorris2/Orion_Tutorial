package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class QuestGuideDialogue extends TutorialWorker
{

	public QuestGuideDialogue(OrionTutorial mission)
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
		script.log(this, false, "Quest Guide Dialogue");
		iFact.dialogue("Talk-to", "Quest Guide", 12).execute();
	}

}
