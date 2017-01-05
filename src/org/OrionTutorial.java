package org;

import org.data.TutorialState;
import org.data.TutorialStates;

import viking.framework.goal.GoalList;
import viking.framework.mission.Mission;
import viking.framework.script.VikingScript;

public class OrionTutorial extends Mission
{	
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
		current = states.getValid();
		if(current != null)
			current.execute();
		
		return 600;
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
