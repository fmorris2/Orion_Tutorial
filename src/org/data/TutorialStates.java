package org.data;

import org.OrionTutorial;
import org.workers.TutorialWorker;
import org.workers.impl.TutorialDone;
import org.workers.impl.master_chef.CookDough;
import org.workers.impl.master_chef.EnterMasterChef;
import org.workers.impl.master_chef.ExitMasterChef;
import org.workers.impl.master_chef.MakeDough;
import org.workers.impl.master_chef.MasterChefDialogue;
import org.workers.impl.master_chef.OpenMusicTab;
import org.workers.impl.quest_guide.ClickEmotesTab;
import org.workers.impl.quest_guide.ClickRun;
import org.workers.impl.quest_guide.PerformEmote;
import org.workers.impl.quest_guide.RunToQuestGuide;
import org.workers.impl.rs_guide.CharacterDesign;
import org.workers.impl.rs_guide.ClickOptionsTab;
import org.workers.impl.rs_guide.ExitRunescapeGuide;
import org.workers.impl.rs_guide.RSGuideDialogue;
import org.workers.impl.survival_expert.CatchShrimps;
import org.workers.impl.survival_expert.CookShrimps;
import org.workers.impl.survival_expert.ExitSurvivalExpert;
import org.workers.impl.survival_expert.MakeFire;
import org.workers.impl.survival_expert.OpenInventory;
import org.workers.impl.survival_expert.OpenSkillsTab;
import org.workers.impl.survival_expert.SurvivalExpertDialogue;
import org.workers.impl.survival_expert.TutorialChopTree;

public class TutorialStates
{
	public final TutorialState[] STATES;
	
	OrionTutorial script;
	
	public TutorialStates(OrionTutorial script)
	{
		this.script = script;
		STATES = new TutorialState[]
		{
			ts(new CharacterDesign(script), 0), ts(new RSGuideDialogue(script), 0, 7),
			ts(new ClickOptionsTab(script), 3), ts(new ExitRunescapeGuide(script), 10),
			ts(new SurvivalExpertDialogue(script), 20, 70), ts(new OpenInventory(script), 30),
			ts(new TutorialChopTree(script), 40, 50), ts(new MakeFire(script), 50),
			ts(new OpenSkillsTab(script), 60), ts(new CatchShrimps(script), 80, 90),
			ts(new CookShrimps(script), 90, 110), ts(new ExitSurvivalExpert(script), 120),
			ts(new EnterMasterChef(script), 130), ts(new MasterChefDialogue(script), 140),
			ts(new MakeDough(script), 150), ts(new CookDough(script), 160), ts(new OpenMusicTab(script), 170),
			ts(new ExitMasterChef(script), 180), ts(new ClickEmotesTab(script), 183),
			ts(new PerformEmote(script), 187), ts(new ClickOptionsTab(script), 190),
			ts(new ClickRun(script), 200), ts(new RunToQuestGuide(script), 210),
			
			
			
			
			
			ts(new TutorialDone(script), 1000)
		};
	}
	
	public TutorialState getValid()
	{
		for(TutorialState state : STATES)
			if(state.isValid())
				return state;
		
		return null;
	}
	
	private TutorialState ts(TutorialWorker worker, int... vals)
	{
		return new TutorialState(worker, vals);
	}
	
	
}
