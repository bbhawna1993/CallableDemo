import java.util.concurrent.Callable;

public class MyCallable implements Callable{

	int num;
	MyCallable(int num)
	{this.num=num;}

	public Object call() throws Exception
	{
		int sum=0;
		System.out.println(Thread.currentThread().getName()+"is finding the sum of first"+num+"numbers");
		for(int i=0;i<=num;i++)
		{sum+=i;}
		System.out.println("sum is"+sum);
		return sum;
	}
}
