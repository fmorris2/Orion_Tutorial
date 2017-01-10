package org.workers.impl.magic_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

public class MagicInstructorDialogue extends TutorialWorker
{
	private static final Position DIALOGUE_POS = new Position(3141, 3086, 0);
	private static final int DIST_THRESH = 7;
	
	public MagicInstructorDialogue(OrionTutorial mission)
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
		script.log(this, false, "Magic Instructor Dialogue");
		if(myPosition().distance(DIALOGUE_POS) > DIST_THRESH)
			walkUtils.walkTo(DIALOGUE_POS);
		else
			iFact.dialogue("Talk-to", "Magic Instructor", 12, 1).execute();
	}

}
