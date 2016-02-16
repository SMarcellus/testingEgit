package tryJavaJRE;


public class HelloWorldMain {
	
	public static int trySomeMath(int arg)
	{
		int myScore = arg*2;
		myScore = myScore/3;
		System.out.print(myScore);
		return myScore;				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*trySomeMath(6); 
		new SecondHellowClass().printAnotherHello();
		String myline = "hello Sue \n";
		System.out.println(myline);
		*/
		long time1 = 1000;
		new MainThread(Thread.MIN_PRIORITY,  100, "first").start();
		new MainThread(Thread.NORM_PRIORITY,  50, "second").start();

	}

}
