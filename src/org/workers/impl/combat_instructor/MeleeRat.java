package org.workers.impl.combat_instructor;

import org.OrionTutorial;
import org.osbot.rs07.api.filter.NameFilter;
import org.osbot.rs07.api.model.NPC;
import org.workers.TutorialWorker;

import viking.api.Timing;
import viking.api.filter.VFilters;

public class MeleeRat extends TutorialWorker
{

	public MeleeRat(OrionTutorial mission)
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
		script.log(this, false, "Melee Rat");
		if(combat.isFighting())
			script.log(this, false, "Waiting to kill rat");
		else
		{
			NPC targ = npcs.closest(VFilters.and(new NameFilter<NPC>("Giant rat"), filters.ABLE_TO_ATTACK_NPC));
			if(targ != null && iFact.clickNpc("Attack", targ).execute())
				Timing.waitCondition(() -> combat.isFighting(), 5000);
		}
		
	}

}
