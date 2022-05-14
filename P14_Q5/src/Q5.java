class Q5{
	
	void basicException() {
		System.out.println("Without use try and catch");
		int b = 0;
		int a = 100/0;
		System.out.println("Done without using try and catch");
		
	}
	
	void handleException() {
		try {
			// Sensitive code
			int a = 100/0;
			System.out.println(a);//Airthmetic expression
			// because the error arises due to '/' operator which is arithmetic
		}
		
		catch(ArithmeticException e) {
			//Exception Handling happens here in catch block
			System.out.println(e.getMessage());
		}
		
		//Rest of the code
		System.out.println("Done");
	}
	
	
	
	
	void stackOverFlowError(int a) {
		
		try {
			while(a>0) {
				a++;
				stackOverFlowError(a);//still be a error bc stack overflow can be handled
			}}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Exception Stack overflow occured");
		}
	}
}
