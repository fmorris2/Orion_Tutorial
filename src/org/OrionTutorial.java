package org;

import org.data.TutorialState;
import org.data.TutorialStates;
import org.osbot.rs07.api.ui.RS2Widget;

import viking.framework.goal.GoalList;
import viking.framework.mission.Mission;
import viking.framework.script.VikingScript;

public class OrionTutorial extends Mission
{	
	private static final int[][] CONT_INTERS = {{162, 33}, {229, 1}};
	
	private TutorialStates states;
	private TutorialState current;
	
	public OrionTutorial(VikingScript script)
	{
		super(script);
	}

	@Override
	public boolean canEnd()
	{
		return states.STATES[states.STATES.length - 1].isValid(); //check the tutorial done state
	}

	@Override
	public String getMissionName()
	{
		return "Orion Tutorial";
	}

	@Override
	public String getCurrentTaskName()
	{
		return current == null ? "Initializing" : current.toString();
	}

	@Override
	public String getEndMessage()
	{
		return "Tutorial Island is completed!";
	}

	@Override
	public GoalList getGoals()
	{
		return null;
	}

	@Override
	public String[] getMissionPaint()
	{
		return null;
	}

	@Override
	public int execute()
	{
		generalChecks();
		
		current = states.getValid();
		if(current != null)
			current.execute();
		
		return 600;
	}
	
	private void generalChecks()
	{
		for(int i = 0; i < CONT_INTERS.length; i++)
		{
			RS2Widget widget = widgets.get(CONT_INTERS[i][0], CONT_INTERS[i][1]);
			if(widget != null)
				widget.interact();
		}
	}

	@Override
	public void onMissionStart()
	{
		states = new TutorialStates(this);
	}

	@Override
	public void resetPaint()
	{}

}
