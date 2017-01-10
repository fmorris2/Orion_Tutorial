package org.workers.impl.magic_instructor;

import org.OrionTutorial;
import org.data.TutorialState;
import org.osbot.rs07.api.filter.NameFilter;
import org.osbot.rs07.api.map.Position;
import org.osbot.rs07.api.model.NPC;
import org.osbot.rs07.api.ui.Spells;
import org.osbot.rs07.input.mouse.MainScreenTileDestination;
import org.workers.TutorialWorker;

import viking.api.Timing;
import viking.api.filter.VFilters;

public class CastAirStrike extends TutorialWorker
{
	private static final Position CAST_TILE = new Position(3139, 3091, 0);
	private final Position TO_CAST;
	
	public CastAirStrike(OrionTutorial mission)
	{
		super(mission);
		TO_CAST = CAST_TILE.translate(random(-1, 1), 0);
	}

	@Override
	public boolean shouldExecute()
	{
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void work()
	{
		script.log(this, false, "Cast Air Strike");
		NPC targ = npcs.closest(VFilters.and(new NameFilter<NPC>("Chicken"), filters.ABLE_TO_ATTACK_NPC));
		int cacheConf = configs.get(TutorialState.CONFIG_ID);
		
		if(!myPosition().equals(TO_CAST))
		{
			camera.toPosition(TO_CAST);
			MainScreenTileDestination mainScreenSpot = new MainScreenTileDestination(bot, TO_CAST);
			if(mouse.click(mainScreenSpot))
				Timing.waitCondition(() -> myPosition().equals(TO_CAST), 4500);
		}
		else if(magic.castSpellOnEntity(Spells.NormalSpells.WIND_STRIKE, targ))
			Timing.waitCondition(() -> cacheConf != configs.get(TutorialState.CONFIG_ID), 4500);		
	}

}
