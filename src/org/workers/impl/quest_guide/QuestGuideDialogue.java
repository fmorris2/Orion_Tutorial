package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.workers.TutorialWorker;

import viking.api.Timing;

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
		
		if(myPosition().getZ() > 0 && iFact.clickObject("Climb-down", "Staircase", 15).execute()) //stuck upstairs
			Timing.waitCondition(() -> myPosition().getZ() == 0, 3000);
		else
			iFact.dialogue("Talk-to", "Quest Guide", 12).execute();
	}

}
