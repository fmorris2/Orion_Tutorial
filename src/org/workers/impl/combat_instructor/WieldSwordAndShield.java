package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class WieldSwordAndShield extends TutorialWorker
{

	public WieldSwordAndShield(OrionTutorial mission)
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
		script.log(this, false, "Wield Sword and Shield");
		itemUtils.wield("Bronze sword");
		itemUtils.wield("Wooden shield");
	}

}
