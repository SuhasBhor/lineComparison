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
			System.out.println("Enter Third Co-ordinates:");
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			System.out.println("Enter Fourth Co-ordinates:");
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			double length1,length2;
			
			length1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
			System.out.println("The length of First line is:" +length1);	
			length2 = Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));
			System.out.println("The length of Second line is:" +length2);	
			
			if(length1 == length2) {
				System.out.println("Lines Are Equals");
			}else if(length1 > length2){
				System.out.println("First Line is Longer than Second Line ");
			}else {
				System.out.println("Second Line is Longer than First Line");
			}
	}
}
