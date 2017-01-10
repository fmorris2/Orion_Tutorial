package org.workers.impl.brother_brace;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class BrotherBraceDialogue extends TutorialWorker
{

	public BrotherBraceDialogue(OrionTutorial mission)
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
		script.log(this, false, "Brother Brace Dialogue");
		iFact.dialogue("Talk-to", "Brother Brace", 30).execute();
	}

}
