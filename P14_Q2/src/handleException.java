public class handleException 
{
	public static void main(String[] args) 
	{
		try 
		{
			// Sensitive code
			int a = 100/0;
			System.out.println(a);
			//Airthmetic expression
			// because the error arises due to '/' operator which is arithmetic
		}
		
		catch(ArithmeticException e) 
		{
			//Exception Handling happens here in catch block
			System.out.println(e.getMessage());
		}
		
		//Rest of the code
		System.out.println("Done");
	}

	}


