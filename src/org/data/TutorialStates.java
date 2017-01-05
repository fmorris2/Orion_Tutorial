package org.data;

import org.OrionTutorial;
import org.workers.TutorialWorker;
import org.workers.impl.TutorialDone;
import org.workers.impl.rs_guide.CharDesign;
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
			ts(new CharDesign(script), 1), ts(new RSGuideDialogue(script), 2),
			
			
			
			
			
			
			
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
	
	private TutorialState ts(TutorialWorker worker, int vals)
	{
		return new TutorialState(worker, vals);
	}
	
	
}
