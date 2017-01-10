package org.data;

import org.OrionTutorial;
import org.workers.TutorialWorker;
import org.workers.impl.TutorialDone;
import org.workers.impl.bank_stage.ExitBankStage;
import org.workers.impl.bank_stage.PollBooth;
import org.workers.impl.bank_stage.TOpenBank;
import org.workers.impl.brother_brace.BrotherBraceDialogue;
import org.workers.impl.brother_brace.ExitBrotherBrace;
import org.workers.impl.brother_brace.OpenFriendsTab;
import org.workers.impl.brother_brace.OpenIgnoreTab;
import org.workers.impl.brother_brace.OpenPrayerTab;
import org.workers.impl.combat_instructor.ClickCombatTab;
import org.workers.impl.combat_instructor.CombatInstructorDialogue;
import org.workers.impl.combat_instructor.EnterRatCage;
import org.workers.impl.combat_instructor.ExitCombatInstructor;
import org.workers.impl.combat_instructor.MeleeRat;
import org.workers.impl.combat_instructor.OpenEquipmentStats;
import org.workers.impl.combat_instructor.OpenEquipmentTab;
import org.workers.impl.combat_instructor.RangeRat;
import org.workers.impl.combat_instructor.WieldDagger;
import org.workers.impl.combat_instructor.WieldSwordAndShield;
import org.workers.impl.financial_advisor.ExitFinancialAdvisor;
import org.workers.impl.financial_advisor.FinancialAdvisorDialogue;
import org.workers.impl.master_chef.CookDough;
import org.workers.impl.master_chef.EnterMasterChef;
import org.workers.impl.master_chef.ExitMasterChef;
import org.workers.impl.master_chef.MakeDough;
import org.workers.impl.master_chef.MasterChefDialogue;
import org.workers.impl.master_chef.OpenMusicTab;
import org.workers.impl.mining_instructor.ExitMiningInstructor;
import org.workers.impl.mining_instructor.MineCopper;
import org.workers.impl.mining_instructor.MineTin;
import org.workers.impl.mining_instructor.MiningInstructorDialogue;
import org.workers.impl.mining_instructor.ProspectCopper;
import org.workers.impl.mining_instructor.ProspectTin;
import org.workers.impl.mining_instructor.SmeltOre;
import org.workers.impl.mining_instructor.SmithDagger;
import org.workers.impl.quest_guide.ClickEmotesTab;
import org.workers.impl.quest_guide.ClickRun;
import org.workers.impl.quest_guide.EnterQuestGuide;
import org.workers.impl.quest_guide.ExitQuestGuide;
import org.workers.impl.quest_guide.OpenQuestTab;
import org.workers.impl.quest_guide.PerformEmote;
import org.workers.impl.quest_guide.QuestGuideDialogue;
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
			ts(new CookShrimps(script), 90, 100, 110), ts(new ExitSurvivalExpert(script), 120),
			ts(new EnterMasterChef(script), 130), ts(new MasterChefDialogue(script), 140),
			ts(new MakeDough(script), 150), ts(new CookDough(script), 160), ts(new OpenMusicTab(script), 170),
			ts(new ExitMasterChef(script), 180), ts(new ClickEmotesTab(script), 183),
			ts(new PerformEmote(script), 187), ts(new ClickOptionsTab(script), 190),
			ts(new ClickRun(script), 200), ts(new EnterQuestGuide(script), 210),
			ts(new QuestGuideDialogue(script), 220, 240), ts(new OpenQuestTab(script), 230),
			ts(new ExitQuestGuide(script), 250), ts(new MiningInstructorDialogue(script), 260, 290, 330),
			ts(new ProspectTin(script), 270), ts(new ProspectCopper(script), 280), ts(new MineTin(script), 300),
			ts(new MineCopper(script), 310), ts(new SmeltOre(script), 320), ts(new SmithDagger(script), 340, 350),
			ts(new ExitMiningInstructor(script), 360), ts(new CombatInstructorDialogue(script), 370, 410, 470),
			ts(new OpenEquipmentTab(script), 390), ts(new OpenEquipmentStats(script), 400), ts(new WieldDagger(script), 405),
			ts(new WieldSwordAndShield(script), 420), ts(new ClickCombatTab(script), 430), ts(new EnterRatCage(script), 440),
			ts(new MeleeRat(script), 450, 460), ts(new RangeRat(script), 480, 490), ts(new ExitCombatInstructor(script), 500),
			ts(new TOpenBank(script), 510), ts(new PollBooth(script), 520), ts(new ExitBankStage(script), 525),
			ts(new FinancialAdvisorDialogue(script), 530), ts(new ExitFinancialAdvisor(script), 540),
			ts(new BrotherBraceDialogue(script), 550, 570, 600), ts(new OpenPrayerTab(script), 560),
			ts(new OpenFriendsTab(script), 580), ts(new OpenIgnoreTab(script), 590), ts(new ExitBrotherBrace(script), 610),
			
			
			
			
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
