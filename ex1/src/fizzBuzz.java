class fizzBuzzGenerator
{
	void fizzBuzzGenerate()
	{
		for(int num = 1; num <= 100; num++)
		{
			if(isDivisibleBy3(num) && isDivisibleBy5(num))
			{
				System.out.println("FizzBuzz");
			}
			else if(isDivisibleBy3(num))
			{
				System.out.println("Fizz");
			}
			else if(isDivisibleBy5(num))
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(num);
			}
		}
	}
	boolean isDivisibleBy3(int num)
	{
		if(num % 3 == 0)
		{
			return true;
		}
		return false;
	}
	boolean isDivisibleBy5(int num)
	{
		if(num % 5 == 0)
		{
			return true;
		}
		return false;
	}

}
public class fizzBuzz
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			fizzBuzzGenerator obj= new fizzBuzzGenerator();
			obj.fizzBuzzGenerate();
		}
		catch(Exception e)
		{
			System.out.println("Exception" + e);
		}
	}
}
