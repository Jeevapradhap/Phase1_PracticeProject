package PracticeProject;

public class MyThreads
{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
    }

	public static void main(String[] args) {
		MyThreads mt = new  MyThreads();
  		mt.run();

		

	}

}
