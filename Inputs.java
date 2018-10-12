import java.text.DecimalFormat;
import java.util.Scanner;

//Here the user will input all the details
public class Inputs {
	//User chooses what they want to do
	public static int Selection() {
		
		Scanner sc = new Scanner(System.in);
		int Choice;
		
		System.out.println();
		System.out.println("Which of the following are you interested in finding?: ");
		System.out.println("(1) Potential profit for a given trade: ");
		System.out.println("(0) Exit");
		
		Choice = sc.nextInt();
		
		if(Choice < 0 || Choice > 2) {
			System.out.println("INVALID");
			Selection();
		}
		return Choice;
	}
	
	public static void ProfitOption() {
		
		double Delta;
		int Contracts;
		double Cost;
		double Ask;
		double Bid;
		double Profit;
		double ProfitLow;
		double PercentageGain;
		
		Scanner sc = new Scanner(System.in);
		
		//Scanning the main values
		System.out.println("Enter the asking Price: ");
		Ask = sc.nextDouble();
		System.out.println("Enter the Delta: ");
		Delta = sc.nextDouble();
		System.out.println("Enter the number of contracts bought: ");
		Contracts = sc.nextInt();
		
		//Calculations
		Cost = Ask * 100 * Contracts;
		Delta /= 100;
		PercentageGain = (Delta / Ask) * 100;
		Bid = ((Ask / 100) * PercentageGain) + Ask;
		Profit = (Bid-Ask) * 100 * Contracts;
		ProfitLow = Profit / 10;
		
		//Rounding decimals
		DecimalFormat df = new DecimalFormat("#.##");
		
		Cost = Double.valueOf(df.format(Cost));
		Profit = Double.valueOf(df.format(Profit));
		ProfitLow = Double.valueOf(df.format(ProfitLow));
		PercentageGain = Double.valueOf(df.format(PercentageGain));

		//Results
		System.out.println();
		System.out.println("Cost is: "+Cost);
		System.out.println("Percentage gain per $1 rise is: %"+PercentageGain+" ($"+Profit+")");
		System.out.println("For every 10 cents the stock moves, you make: $"+ProfitLow);
				
	}
}
