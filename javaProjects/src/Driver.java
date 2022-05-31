import java.util.Scanner;
import java.text.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		double buyingPrice = sc.nextDouble();
		int day = 1;
		double closingPrice  = 0.1;
		DecimalFormat df = new DecimalFormat("0.00");
		while(true) {
			System.out.println("Enter the closing price for day " + day + "{any negative value to leave: )");
			closingPrice = sc.nextDouble();
			if(closingPrice < 0.0) break;
			double earnings = closingPrice - buyingPrice;
			if(earnings > 0.0) {
				System.out.println("After day "+ day+ ". you earned " + df.format(earnings) + " per share. ");
			}
			else if(earnings < 0.0) {
				System.out.println("After day "+ day+ ". you lost " + df.format(-earnings) + " per share. ");

			}
			else
			{
				System.out.println("After day "+ day + ". you have " + "no earnings per share. ");

			}
			day++;
		}
		sc.close();
		
		
	}

}
