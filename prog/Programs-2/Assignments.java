package Programs;
import java.util.*;

public class Assignments {
	static void first(int a)
	{
		if(a>0)
		{
			System.out.println(a+" : is positive");
		}
		else
		{
			System.out.println(a+" : is negative");
		}
	}
	
	
	static void second(double a,double b,double c)
	{
		double d= b*b-4.0*a*c;  
		if(d>0.0)   
		{  
		double x1 =(-b + Math.pow(d, 0.5))/(2.0 * a);  
		double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + x1 + " and " + x2);  
		}   
		else if (d == 0.0)   
		{  
		double x1 = -b / (2.0 * a);  
		System.out.println("The roots is " + x1);  
		}   
		else   
		{  
		System.out.println("Roots are not real");  
		}  
		 
	}
	
	static void third(int year,boolean leap)
	{
		
		if (year%4==0) 
		 {
		      if (year%100==0)
		      {
		        if (year%400==0) {
		        	leap=true;
		        }
		          
		        else {
		        	leap=false;
		        }
		          
		      } 
		      else {
		    	  leap=true;
			}
		    } 
		else {
			leap=false;
		}
		System.out.println("the year is leap:"+leap);
	}
	
	static void fourth(int[] arr) {
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/5;
		System.out.println("The sum is:"+sum);
		System.out.println("The average is:"+avg);
		
	}
	
	
    static void fifth(int rows) {
    	
    	for(int i=1;i<=rows;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Assignments.first(no);
		
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		Assignments.second(a,b,c);
		
		
		
		
		
		int year=sc.nextInt();
		Assignments.third(year,false);
		
		
		
		
		
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		Assignments.fourth(arr);
		
		
		
		
		int rows=sc.nextInt();
		Assignments.fifth(rows);
		
		
		
		
		

	}

}
