package Asgnmt_3;

class Demo implements Cloneable { 
	
	
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  

		
		
}
}

 class Progms
 {
	 public static void main(String args[]) throws CloneNotSupportedException
	 {
		 Demo a=new Demo();
		 Demo b=(Demo)a.clone();
		 System.out.println(b.toString());
		 
		 
		 
		 
	 }
 }
