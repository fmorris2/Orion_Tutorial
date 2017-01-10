package org.workers.impl.brother_brace;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

public class BrotherBraceDialogue extends TutorialWorker
{
	private static final Position DIALOGUE_POS = new Position(3126, 3107, 0);
	private static final int DIST_THRESH = 8;
	
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
		if(myPosition().distance(DIALOGUE_POS) > DIST_THRESH)
			walkUtils.walkTo(DIALOGUE_POS);
		else
			iFact.dialogue("Talk-to", "Brother Brace", 15).execute();
	}

}
