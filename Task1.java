import java.util.Scanner;
class Task1 extends Thread {
public void run()
{
for (int i=0;i<=26;i++) {
	try {
		int num=(int)(65+Math.random()*90);
		sleep(500);
		char c=(char)num;
		System.out.println(c);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 t1=new Task1();
Task1 t2=new Task1();
t1.start();
t2.stop();
System.out.println("thread t2 is stopped");
	}

}
