package lab1;

import java.util.Scanner; // Scanner is in the java.util package

public class pension {
	public static void main(String[] args) {
	    // Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter Data
		System.out.print("Enter a number for Monthly SSL: ");
		double Monthlyssl = input.nextDouble();
		
		System.out.print("Enter a number for Required Income: ");
		double Requiredincome = input.nextDouble();
		
		System.out.print("Enter a number for Annual Return retired: ");
		double Arr = input.nextDouble();
		
		System.out.print("Enter a number for Years Retired: ");
		double Yearsretired = input.nextDouble();
		
		System.out.print("Enter a number for Annual Return Work: ");
		double Arw = input.nextDouble();
		
		System.out.print("Enter a number for Years To Work: ");
		double Yearstowork = input.nextDouble();
		
		// Compute the difference between RequiredIncome and MonthlySSL
		double whatyouneedsaved = (Requiredincome - Monthlyssl) * ((1-(1 + Arr / 12)));
				
		
	}

}
