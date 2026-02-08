// Latisha Hudson CIS406 Order Entry Phase 1
package orderEntryPhase1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		// Enter item number
		System.out.print("Enter item number: ");
		String itemNumber = input.nextLine();
		
		// Enter item description
		System.out.print("Enter item description: ");
		String itemDescription = input.nextLine();
		
		// Enter item price
		System.out.print("Enter item price: ");
		double itemPrice = input.nextDouble();
		
		// Enter quantity ordered
		System.out.print("Enter quantity ordered: ");
		int quantity = input.nextInt();
		
		// Enter total tax
		System.out.print("Enter total tax amount: ");
		double taxAmount = input.nextDouble();
		
		// Enter total discount
		System.out.print("Enter total discount amount: ");
		double discountAmount = input.nextDouble();
		
		// Calculate net amount
		double netAmount = (itemPrice * quantity) + taxAmount - discountAmount;
		
		// Display formatted output
		System.out.println("\nITEM DETAILS");
		System.out.println("------------------------------------------------------------");
		System.out.println("Item Number\tDescription\tPrice\t\tQty\tTax\t\tDiscount\tNet Amount");
		System.out.println(itemNumber + "\t\t" +                           
							itemDescription + "\t\t" +
		                    df.format(itemPrice) + "\t\t" +
		                    quantity + "\t" +
		                    df.format(taxAmount) + "\t\t" +
		                    df.format(discountAmount) + "\t\t" +
		                    df.format(netAmount));
		                                                                                 
		input.close();
	}

}
