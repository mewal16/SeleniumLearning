package Assignment1;

public class Above80 {

	int rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 8- Write a program to print below students marks who have scored above 80
		// Example- 78,12,89,55,35
		// Output-  78,89

		int a[]= {78,12,89,55,35};
		for (int i = 0; i < 5; i++) {
			if(a[i]>80) {
				System.out.println(a[i]);
				
			}

		}

	}
}