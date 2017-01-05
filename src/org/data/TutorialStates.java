package org.data;

import org.OrionTutorial;
import org.workers.TutorialWorker;
import org.workers.impl.TutorialDone;
import org.workers.impl.rs_guide.CharacterDesign;
import org.workers.impl.rs_guide.ClickOptionsTab;
import org.workers.impl.rs_guide.ExitRunescapeGuide;
import org.workers.impl.rs_guide.RSGuideDialogue;

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
