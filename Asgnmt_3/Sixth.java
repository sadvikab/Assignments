package Asgnmt_3;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,2,6,1,2};
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big=arr[i];
			}
		}
		System.out.println("The largest no is:"+big);
		
	}

}
