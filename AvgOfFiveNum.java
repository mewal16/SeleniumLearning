package Assignment1;

public class AvgOfFiveNum {
	
	
	int rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task 3 – Write a program to print the sum of below 5 numbers.
		//10,90.78,111,8989,7876
		int []a = {10,90,111,8989,7876};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);

		
		
	}

}
