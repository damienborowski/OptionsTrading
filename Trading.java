import java.text.DecimalFormat;
import java.util.Scanner;

public class Trading {
	public static void main(String[] args){
		
		double CurrentPrice;
		double FuturePrice;
		double Difference;
		double Delta;
		int Contracts;
		double Commission = 1.13;
		double Cost;
		double Ask;
		double Bid;
		double Profit;
		double PercentagePL;
		
		Scanner sc = new Scanner(System.in);
		
		//Scanning the main values
		System.out.println("Enter the Stocks Current Price: ");
		CurrentPrice = sc.nextDouble();
		System.out.println("Enter the Stocks price you want to achieve: ");
		FuturePrice = sc.nextDouble();
		System.out.println("Enter the asking Price: ");
		Ask = sc.nextDouble();
		System.out.println("Enter the number of contracts bought: ");
		Contracts = sc.nextInt();
		System.out.println("Enter the Delta: ");
		Delta = sc.nextDouble();
		
		//Calculations
		Cost = (Ask * 100) * (Contracts * Commission);
		Delta = Delta/100;
		Difference = (FuturePrice - CurrentPrice) * Delta;
		Bid = (Ask + Difference ) - 0.03;
		Profit = ((Bid * 100) * (Contracts * Commission)) - Cost;
		
		//Rounding decimals
		DecimalFormat df = new DecimalFormat("#.##");
		
		Cost = Double.valueOf(df.format(Cost));
		Profit = Double.valueOf(df.format(Profit));
		
		//Results
		System.out.println("Cost is: "+Cost);
		System.out.println("Profit is: "+Profit);

	}
}
