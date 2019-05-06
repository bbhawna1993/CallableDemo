import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args)
	{
		MyCallable[] jobs= {
				new MyCallable(10),
				new MyCallable(5),
				new MyCallable(6),
				new MyCallable(7),
				new MyCallable(9),
				new MyCallable(8)};

		ExecutorService service=Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs)
		{
			Future f=service.submit(job);
		}

		service.shutdown();
	}
}
