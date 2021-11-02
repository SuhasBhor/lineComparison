package lineComparison;

import java.util.Scanner;

public class lineComparison {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Co-ordinates:");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Enter Second Co-ordinates:");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			double length;
			
			length = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
			System.out.println("The length of line is:" +length);	
	}
}
