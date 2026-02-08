// Latisha Hudson CIS406 Order Entry Phase 2
package OrderEntryPhase2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class orderEntryPhase2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		DecimalFormat pf = new DecimalFormat("0.00%");
		
		// Input Data
		System.out.print("Enter item number: ");
		String itemNumber = input.nextLine();
		
		System.out.print("Enter item description: ");
		String itemDescription = input.nextLine();
		
		System.out.print("Enter item price: ");
		double itemPrice = input.nextDouble();
		
		System.out.print("Enter quantity ordered: ");
		int quantity = input.nextInt();
		
		double grossAmount = itemPrice * quantity;
		
		System.out.print("Enter tax percentage: ");
		double taxPercent = input.nextDouble();
		double taxAmount = grossAmount * (taxPercent / 100);

		System.out.print("Enter discount percentage: ");
		double discountPercent = input.nextDouble();
		double discountAmount = grossAmount * (discountPercent / 100);
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		
		
		// Output
		System.out.println("\nORDER ITEM DETAILS");
		System.out.println("--------------------------------------------------------------------------");
		
		
		System.out.println(
				"Item #\t\tDescription\t\tPrice\t\tQty\tTax %\t\tTax Amt\t\tDisc %\t\tDisc Amt\tNet Amt"
		);
		
		System.out.println(itemNumber + "\t\t" +                       
							itemDescription + "\t\t" +
							df.format(itemPrice) + "\t\t" +
							quantity + "\t" +
							taxPercent + "%\t\t" +
							df.format(taxAmount) + "\t\t" +
							discountPercent + "%\t\t" +
							df.format(discountAmount) + "\t\t" +
							df.format(netAmount)
		);
		                                                                                                                                    
		input.close();
		

	}

}
