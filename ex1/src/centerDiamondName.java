import java.io.BufferedReader;
import java.io.InputStreamReader;

public class centerDiamondName
{
	public static void main(String [] args) throws Exception
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'n' value:");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter your name:");
			String name = br.readLine();
			int m = 1;
			int n1 = n - 1;
			for (int i = 0; i < n1; i++)
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
			m = m - 2;
			System.out.println(name);
			for (int i = (n - 1); i > 0; i--)
			{
				for(int j = i; j < n ; j++)
				{
					System.out.print(" ");
				}
				for(int k = 0; k < m ; k++)
				{
					System.out.print("*");
				}
				System.out.println("");
				m = m - 2;
			}

		}
		catch(Exception e)
		{
			System.out.println("Exception:" + e);
		}
	}
}
