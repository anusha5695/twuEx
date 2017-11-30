import java.io.BufferedReader;
import java.io.InputStreamReader;

public class isocelesTriangle
{
	public static void main(String [] args) throws Exception
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'n' value:");
			int n = Integer.parseInt(br.readLine());
			int m=1;
			for (int i = 0; i < n; i++)
			{
				for(int j = (n - 1); j > i ; j--)
				{
					System.out.print(" ");
				}
				for(int k = 0; k < m ; k++)
				{
					System.out.print("*");
				}
				System.out.println("");
				m = m + 2;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception:" + e);
		}
	}
}
