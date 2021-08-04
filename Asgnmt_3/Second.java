package Asgnmt_3;

public class Second {
	public static void main(String args[])
	{
		int no=999;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
	
		}
	
		if(999==rev) {
			System.out.println("999 is pallindrome");
			
		}
		else
		{
			System.out.println("999 is not pallindrome");
		}
	}
	

}
