public class Q6
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
	
	void indexOutOfBound() 
	{
		int arr[] = {2,3,4,5,6};
		try 
		{
			for(int i = 0;i<8;i++) {
				System.out.println(arr[i] +" ");
			}
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());//Index 5 out of bound for length 5
			System.out.println("Exception index out of bound");
		}
	}
	
}

	