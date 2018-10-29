package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import threads.Increment;
import threads.MyThread;

public class Main 
{
	public static int globalIncrementVar = 0;
	
	public static void main(String args[]) throws FileNotFoundException
	{
		Increment increment = new Increment();
		List<Thread> threads = new ArrayList<>();
		
		for(int i = 0; i < Integer.parseInt(args[0]); i++)
		{
			threads.add(new MyThread(i, increment));
			threads.get(i).start();
		}
		
		for(Thread thread : threads)
		{
			try 
			{
				thread.join();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
}
