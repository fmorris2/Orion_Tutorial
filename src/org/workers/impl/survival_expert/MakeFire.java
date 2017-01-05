package org.workers.impl.survival_expert;

import java.util.Comparator;
import java.util.List;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.osbot.rs07.event.WalkingEvent;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class MakeFire extends TutorialWorker
{
	public MakeFire(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public boolean shouldExecute()
	{
		return inventory.contains("Logs");
	}

	@Override
	public void work()
	{
		script.log(this, false, "Make fire");
		Position closestFree = getClosestFree();
		if(closestFree != null)
		{
			if(myPosition().equals(closestFree) ||
					(execute(new WalkingEvent(closestFree)).hasFinished() 
							&& Timing.waitCondition(() -> myPosition().equals(closestFree), 4000)))
			{
				final int CONF_CACHE = configs.get(TutorialState.CONFIG_ID);
				
				if(itemUtils.itemOnItem("Tinderbox", "Logs") && Timing.waitCondition(() -> myPlayer().isAnimating(), 2500))
					Timing.waitCondition(() -> CONF_CACHE != configs.get(TutorialState.CONFIG_ID), 6500);
			}
		}
		
	}
	
	private Position getClosestFree()
	{
		Area lightableArea = new Area(myPosition().translate(-5, 5), myPosition().translate(5, -5));
		List<Position> tiles = lightableArea.getPositions();
		script.log(this, false, "lightable area total tiles: " + tiles.size());
		
		tiles.sort(posComparator());
		
		for(Position p : tiles)
		{
			script.log(this, false, "Checking tile " + p);
			if(posUtils.isWalkable(p) && !objectUtils.isOnTile("Fire", p))
				return p;
		}
		
		return null;
	}
	
	private Comparator<Position> posComparator()
	{
		return new Comparator<Position>()
		{
			public int compare(Position p1, Position p2)
			{	
				return myPosition().distance(p1) - myPosition().distance(p2);
			}
		};
	}

}
