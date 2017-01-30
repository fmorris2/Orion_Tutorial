package org.workers.impl.master_chef;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CookDough extends TutorialWorker
{
	private static final Position FALLBACK = new Position(3075, 3083, 0);
	
	public CookDough(OrionTutorial mission)
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
		script.log(this, false, "Cook dough");
		if(iFact.itemOnObj("Bread dough", "Range", 12, FALLBACK).execute())
			Timing.waitCondition(() -> inventory.contains("Bread"), 3500);
		else
		{
			camera.movePitch(random(0, 360));
			camera.moveYaw(random(0, 100));
		}
	}

}
