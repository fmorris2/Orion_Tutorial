package org;

import viking.framework.goal.GoalList;
import viking.framework.goal.impl.InfiniteGoal;
import viking.framework.mission.Mission;
import viking.framework.script.VikingScript;

public class OrionTutorial extends Mission
{

	public OrionTutorial(VikingScript script)
	{
		super(script);
	}

	@Override
	public boolean canEnd()
	{
		return false;
	}

	@Override
	public String getMissionName()
	{
		return "Orion Tutorial";
	}

	@Override
	public String getCurrentTaskName()
	{
		return null;
	}

	@Override
	public String getEndMessage()
	{
		return null;
	}

	@Override
	public GoalList getGoals()
	{
		return new GoalList(new InfiniteGoal());
	}

	@Override
	public String[] getMissionPaint()
	{
		return null;
	}

	@Override
	public int execute()
	{
		return 600;
	}

	@Override
	public void onMissionStart()
	{
		
	}

	@Override
	public void resetPaint()
	{
	}

}
