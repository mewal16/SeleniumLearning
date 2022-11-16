package Assignment1;

public class Break {

	int rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 9- Write a program which will break the current execution if it find number 85
		// Input – [12,34,66,85,900]


		int a[]= {12,34,66,85,900};
		for (int i = 0; i < 5; i++) {
			if(a[i]==85) {
				System.out.println(a[i]);
				break;
			}

		}

	}
}