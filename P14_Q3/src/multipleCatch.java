public class multipleCatch
{
	public static void main(String[] args) 
	{
		
			try {
				int a = 100/0;
				System.out.println(a);
			}
			
			catch(ArithmeticException e) {
				//Exception Handling happens here in catch block
				System.out.println(e.getMessage());
			}
			
			catch(Exception e) 
			{
				System.out.println(e.getMessage());
			}
	}
	}
