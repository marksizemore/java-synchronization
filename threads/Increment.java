package threads;

import main.Main;

public class Increment 
{
	public void incrementGlobal(String name)
	{
		Main.globalIncrementVar++;
		System.out.print(name + ": " + Main.globalIncrementVar + "\n");
	}
}
