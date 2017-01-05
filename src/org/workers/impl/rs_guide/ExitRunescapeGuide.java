package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.workers.TutorialWorker;

public class ExitRunescapeGuide extends TutorialWorker
{
	public ExitRunescapeGuide(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{return true;}

	@Override
	public void work()
	{
		script.log(this, false, "Exit RuneScape Guide");
		iFact.clickObject("Open", "Door", new Area(3096, 3109, 3099, 3105)).execute();
	}

}
