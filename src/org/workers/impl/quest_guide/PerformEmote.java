package org.workers.impl.quest_guide;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.ui.RS2Widget;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class PerformEmote extends TutorialWorker
{
	private static final int INTER_MASTER = 216, CHILD = 1;
	private static final int EMOTE_MIN = 0, EMOTE_MAX = 12;
	
	public PerformEmote(OrionTutorial mission)
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
		script.log(this, false, "Perform Emote");
		if(tabs.open(Tab.EMOTES))
		{
			RS2Widget w = widgets.get(INTER_MASTER, CHILD, random(EMOTE_MIN, EMOTE_MAX));
			int confVal = configs.get(TutorialState.CONFIG_ID);
			
			if(w != null && w.interact())
				Timing.waitCondition(() -> configs.get(TutorialState.CONFIG_ID) != confVal, 5000);
		}
		
	}

}
