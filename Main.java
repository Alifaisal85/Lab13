package Lab3;
class Thread1 extends Thread
{
public void run()
{
	int n=10;
	for(int i=1; i<=10; i++)
	{
		System.out.println(n+"*"+i+"="+n*i);
	}
}
}
class Thread2 extends Thread
{
	public void run()
	{
		int n=52;
		for(int i=1; i<=52; i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 th1=new Thread1();
th1.start();
Thread2 th2=new Thread2();
th2.start();
	}

}
