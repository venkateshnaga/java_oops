
//Example for synchronized block

class MyThread extends Thread
{
	int count=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<2000;i++)
			{
					System.out.println("hai");
				count=count+1;
			}
			//notify();
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		synchronized(t)
		{
			try{
				t.sleep(10000000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(t.count);
	}
}