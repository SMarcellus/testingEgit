package tryJavaJRE;

public class MainThread extends Thread{
	int count = 0;
	int priority = Thread.NORM_PRIORITY;
    long sleepTime = 20;
    String name = "main";
	
	public MainThread(int _priority, long _sleepTime, String _name){
        name = _name;
		priority = _priority;
	    sleepTime = _sleepTime;
	}
	
	public void run(){
		do
		{
			count++;
			System.out.println(name + ": " + count);	
			try {
				Thread.sleep(sleepTime);
			}
			catch (Throwable ignore) 
			{
				System.out.println("sleep failed?");
			}
		}
		while (count < 10);
	}


}
