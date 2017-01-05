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
		script.log(this, false, "Talk to RuneScape Guide");
	}

	@Override
	public boolean shouldExecute()
	{
		return !widgets.isVisible(CharacterDesign.INTER_MASTER);
	}

}
