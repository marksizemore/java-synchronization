package threads;

public class MyThread extends Thread
{	
	Increment increment;
	
	public MyThread(int n, Increment increment)
	{
		super("Thread " + n);
		this.increment = increment;
	}
	
	public void run()
	{
			synchronized(increment)
			{
				increment.incrementGlobal(getName());
			}
	}
}
