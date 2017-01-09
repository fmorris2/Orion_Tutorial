package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.workers.TutorialWorker;

public class RangeRat extends TutorialWorker
{

	public RangeRat(OrionTutorial mission)
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
		script.log(this, false, "Range rat");
		if(itemUtils.wield("Shortbow") && itemUtils.wield("Bronze arrow"))
		{
			script.log(this, false, "Wielding shortbow and arrows");
		}
	}

}
