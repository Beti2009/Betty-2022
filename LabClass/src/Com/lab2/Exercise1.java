package Com.lab2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write the java code that assigns 1 to X if Y is greater than 0
		Scanner in = new Scanner(System.in);
		System.out.println("Enter X value: ");
		int y = in.nextInt();
		if (y>0) {
			int x = 1;
			System.out.println("The value of Y: " + x);
		}
	}

}
