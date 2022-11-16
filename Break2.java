package Assignment1;

public class Break2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 10- Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

		String a[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for (int i = 0; i < 5; i++) {
			if(a[i]=="Selenium") {
				System.out.println(a[i]);
				break;
			}

		}

	}
}