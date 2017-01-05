package org.data;

import org.workers.TutorialWorker;

public class TutorialState
{
	public static final int CONFIG_ID = 281;
	
	public final int[] CONFIG_VALS;
	
	private TutorialWorker worker;
	
	public TutorialState(TutorialWorker w, int... vals)
	{
		CONFIG_VALS = vals;
		worker = w;
	}
	
	public boolean isValid()
	{
		if(!worker.shouldExecute())
			return false;
		
		for(int val : CONFIG_VALS)
			if(worker.configs.isSet(CONFIG_ID, val))
				return true;
		
		return false;
	}
	
	public void execute()
	{
		worker.work();
	}
	
	public String toString()
	{
		return worker.toString();
	}
}
