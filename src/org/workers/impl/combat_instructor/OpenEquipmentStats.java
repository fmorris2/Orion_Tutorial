package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.RS2Widget;
import org.osbot.rs07.api.ui.Tab;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class OpenEquipmentStats extends TutorialWorker
{
	private static final int MASTER = 387, CHILD = 17;
	
	public OpenEquipmentStats(OrionTutorial mission)
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
		script.log(this, false, "Open Equipment Stats");
		if(tabs.open(Tab.EQUIPMENT))
		{
			RS2Widget widget = widgets.get(MASTER, CHILD);
			if(widget != null && widget.interact() 
					&& Timing.waitCondition(() -> widgets.getWidgetContainingText("Equip Your Character...") != null, 3500))
			{
				RS2Widget close = widgets.getWidgetContainingText("Close");
				if(close != null)
					close.interact();
			}
		}
	}

}
