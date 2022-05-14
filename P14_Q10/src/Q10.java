class Q10
{
	public static void main(String[] args) {
		 
		 /* checked vs unchecked exception example */
		 try {
		  Class.forName("com.mcnz.Example");
		 } catch (ClassNotFoundException e) {
		  System.out.println("Class was not found.");
		 }
		    
		 String input = null;
		 input.length(); // throws an unchecked exception
		    
		}
}