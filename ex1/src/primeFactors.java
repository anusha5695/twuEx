import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class primeFactorsGenerator
{
	ArrayList<Integer> primeFactorGenerate(int n)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count = 0;
		for(int i = 1; i <= n ; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				if(n % i == 0)
				{
					arr.add(i);
				}
			}
			count = 0;
		}
		return arr;
	}
}
public class primeFactors
{
	public static void main(String [] args) throws Exception
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'n' value:");
			int n = Integer.parseInt(br.readLine());
			primeFactorsGenerator obj = new primeFactorsGenerator();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr = obj.primeFactorGenerate(n);
			System.out.println("Output:" + arr);

		}
		catch(Exception e)
		{
			System.out.println("Exception:" + e);
		}
	}
}
