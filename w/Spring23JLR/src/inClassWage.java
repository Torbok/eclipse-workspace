import java.util.Scanner;
public class inClassWage {

	public static void main(String[] args) {
		double payRate=0.0,pay=0.0,overPay=0.0;
		int hours,shift;
		String outp = "";
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter the amount of hours you worked: ");
		hours = kb.nextInt();
		kb.nextLine();
		System.out.printf("Enter the shift you worked (1-3): ");
		shift = kb.nextInt();
		kb.nextLine();
		if (shift==1) {
			payRate = 23.00;
		}
		else if (shift==2) {
			payRate = 25.00;
		}
		else {
			payRate = 32.00;
		}
		if (hours<=40) {
			pay = hours*payRate;
		}
		else {
			overPay = ((hours-40)*payRate)*1.5;
			pay=40*payRate;
		}
		System.out.printf("Payment: $%,.2f\n",pay);
		System.out.printf("Overpay: $%,.2f\n",overPay);
		System.out.println(outp);
		kb.close();
		System.exit(0);
	}

}
