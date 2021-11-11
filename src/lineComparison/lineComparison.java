package lineComparison;

import java.util.Scanner;

public class lineComparison {
	double x1,x2,x3,x4;
	double y1,y2,y3,y4;
	double length1,length2;
	
	public void calculateLength() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Co-ordinates:");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			System.out.println("Enter Second Co-ordinates:");
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			System.out.println("Enter Third Co-ordinates:");
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			System.out.println("Enter Fourth Co-ordinates:");
			x4 = sc.nextInt();
			y4 = sc.nextInt();
			
			System.out.println("First Point is: ( " +x1 + " , " +y1+ " )");
			System.out.println("First Point is: ( " +x2 + " , " +y2+ " )");
			System.out.println("First Point is: ( " +x3 + " , " +y3+ " )");
			System.out.println("First Point is: ( " +x4 + " , " +y4+ " )");
			
			length1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
			System.out.println("The length of First line is:" +length1);	
			length2 = Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));
			System.out.println("The length of Second line is:" +length2);	
			
			compareTo(length1,length2);
			equals(length1,length2);
	}		
	public void compareTo(double length1,double length2) {
		if (length1 == length2) {
			System.out.println("\n The two lines are equal in length");
		}
		
		else if (length1 > length2) {
			System.out.println("\n The first line is greater than the second. ");
		}
		
		else {
			System.out.println("\n The second line is greater than the first. ");
		}
	}
	
	public void equals(double length1, double length2) {
		if(length1 == length2) {
			System.out.println("\n The two lines are equal in length");
		}else {
			System.out.println("\n The two lines are not equal in length");
		}
	}
}
