package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class WieldDagger extends TutorialWorker
{

	public WieldDagger(OrionTutorial mission)
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
		script.log(this, false, "Wield Dagger");
		itemUtils.wield("Bronze dagger");
	}

}
