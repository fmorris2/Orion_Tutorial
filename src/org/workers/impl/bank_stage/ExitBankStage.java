package org.workers.impl.bank_stage;

import org.OrionTutorial;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class ExitBankStage extends TutorialWorker
{
	private static final Area DOOR_AREA = new Area(new Position(3124, 3125, 0), new Position(3126, 3123, 0));
	private static final Position EXIT_POS = new Position(3125, 3124, 0);
	private static final Position DOOR_POS = new Position(3124, 3124, 0);
	
	private boolean hasMoved;
	
	public ExitBankStage(OrionTutorial mission)
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
		script.log(this, false, "Exit bank stage");
		
		if(dialogues.isPendingContinuation())
			dialogues.clickContinue();
		
		if(!hasMoved && walkUtils.walkTo(DOOR_POS))
			hasMoved = true;
		else if(iFact.clickObject("Open", "Door", DOOR_AREA).execute())
			Timing.waitCondition(() -> myPosition().equals(EXIT_POS), 4500);
			
	}

}
