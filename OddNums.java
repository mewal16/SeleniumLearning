package Assignment1;

public class OddNums {

	int rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 5- Write a program to print all odd numbers from 1-50

		for (int i = 1; i <= 1000; i++) {
			if ((i>1 && i%2!=0 && i%3!=0 && i%5!=0)||(i==2 || i==3 || i== 5) ){
				System.out.println(i);
			}
		}

	}

}
