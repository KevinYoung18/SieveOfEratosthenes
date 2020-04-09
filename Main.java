import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		long time = System.currentTimeMillis();
		
		ArrayList<Integer> primes = FindPrimes.findTo(1000000);

		time  = System.currentTimeMillis() - time;
		primes.forEach((n) -> {System.out.print(n + "\n");});
		
		System.out.println("Time (ms): " + time);

	}

}
