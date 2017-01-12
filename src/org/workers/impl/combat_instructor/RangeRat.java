package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.filter.NameFilter;
import org.osbot.rs07.api.map.Position;
import org.osbot.rs07.api.model.NPC;
import org.workers.TutorialWorker;

import viking.api.Timing;
import viking.api.filter.VFilters;
import viking.api.interaction.impl.npc.ClickNpc;

public class RangeRat extends TutorialWorker
{
	private static final Position RANGE_POS = new Position(3105, 9509, 0);
	
	public RangeRat(OrionTutorial mission)
	{
		super(mission);
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
		script.log(this, false, "Range rat");
		if(itemUtils.wield("Shortbow") && itemUtils.wield("Bronze arrow"))
		{
			if(combat.isFighting())
				script.log(this, false, "Waiting for rat to die");
			else
			{
				NPC targ = npcs.closest(VFilters.and(new NameFilter<NPC>("Giant rat"), filters.ABLE_TO_ATTACK_NPC));
				ClickNpc clickNpc = iFact.clickNpc("Attack", targ);
				clickNpc.setNeedsToReach(false);
				if(targ != null && clickNpc.execute())
				{
					if(!Timing.waitCondition(() -> combat.isFighting(), 5000))
						walkUtils.walkTo(RANGE_POS);
				}
			}
		}
	}

}
