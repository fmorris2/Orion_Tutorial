package org.workers.impl.rs_guide;

import org.OrionTutorial;
import org.osbot.rs07.api.ui.RS2Widget;
import org.workers.TutorialWorker;

import viking.api.Timing;

public class CharacterDesign extends TutorialWorker
{
	public static final int INTER_MASTER = 269, ACCEPT_BUTTON = 100;
	
	public CharacterDesign(OrionTutorial mission)
	{
		super(mission);
	}

	@Override
	public void work()
	{
		script.log(this, false, "Design character");
		for(DESIGN_OPTIONS option : DESIGN_OPTIONS.values())
		{
			RS2Widget leftOption = widgets.get(INTER_MASTER, option.LEFT), rightOption = widgets.get(INTER_MASTER, option.RIGHT);
			if(leftOption == null || rightOption == null)
				continue;
			
			int leftClicks = random(0, 6), rightClicks = random(0, 6);
			while(leftClicks > 0 || rightClicks > 0)
			{
				boolean leftClick = random(0, 1) == 0;
				if(leftClick && leftClicks-- >= 0)
					leftOption.interact();
				else if(rightClicks-- >= 0)
					rightOption.interact();
				
				if(option == DESIGN_OPTIONS.GENDER)
					break;
				
				waitMs(random(100, 600));
			}
		}
		
		RS2Widget acceptButton = widgets.get(INTER_MASTER, ACCEPT_BUTTON);
		if(acceptButton != null && acceptButton.interact())
			Timing.waitCondition(() -> !shouldExecute(), 2000);
		
		//TODO KILL INSTANCE TO AVOID LOCKS
		
	}

	@Override
	public boolean shouldExecute()
	{
		return widgets.isVisible(INTER_MASTER);
	}

	enum DESIGN_OPTIONS
	{
		HEAD(106, 113),
		JAW(107, 114),
		TORSO(108, 115),
		ARMS(109, 116),
		HANDS(110, 117),
		LEGS(111, 118),
		FEET(112, 119),
		HAIR(105, 121),
		TORSO_COLOR(123, 127),
		LEGS_COLOR(122, 129),
		FEET_COLOR(124, 130),
		SKIN(125, 131),
		GENDER(136, 137);
		
		public final int LEFT, RIGHT;
		DESIGN_OPTIONS(int left, int right)
		{
			LEFT = left;
			RIGHT = right;
		}
	}

}
