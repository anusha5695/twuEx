import java.io.BufferedReader;
import java.io.InputStreamReader;

public class horizontalLine
{
	public static void main(String [] args) throws Exception
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'n' value:");
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++)
				System.out.print("*");
		}
		catch(Exception e)
		{
			System.out.println("Exception:" + e);
		}
	}
}

