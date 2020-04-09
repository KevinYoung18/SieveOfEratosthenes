import java.util.ArrayList;
import java.util.Arrays;

public class FindPrimes 
{
	static ArrayList<Integer>findTo(int lastNum)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int lastNumSqrt = (int)Math.sqrt((double)lastNum) + 2;
		boolean[] isPrime = new boolean[lastNum+1];
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i < lastNumSqrt; i++)
		{
			if(isPrime[i])
			{
				for(int j = i+i; j < lastNum+1; j+=i)
				{
					isPrime[j] = false;
				}
				primes.add(i);
			}
		}
		for(int i = lastNumSqrt; i < lastNum + 1; i++)
		{
			if(isPrime[i])
			{
				primes.add(i);
			}
		}
		
		return primes;
	}
}
