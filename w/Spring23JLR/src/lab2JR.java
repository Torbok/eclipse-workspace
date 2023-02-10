import java.util.Scanner;
public class lab2JR {

	public static void main(String[] args) {
		int year=2023;
		int month=1;
		int months,years;
		double debt=300.00;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=kb.next();
		kb.nextLine();
		System.out.print("Enter the year: ");
		int payYear=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the month of your payment (1-12): ");
		int payMonth=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the amount of your payment: ");
		double payment=kb.nextDouble();
		kb.nextLine();
		years=payYear-year;
		months=(payMonth-month)+years*12;
		debt=debt-payment;
		if (debt<=0) {
			System.out.print("Congratulations "+name+", you are free from your continuous collection harassments.");
		}
		else if (months>6) {
			System.out.print("You still owe $"+debt+" and are "+months+" months late so be prepared to be flooded by the collections department.");
		}
		else if (months>4) {
			System.out.print("You still owe $"+debt+" and are "+months+" months late so we will be taking your firstborn until you pay your bill.");
		}
		else if (months>2) {
			System.out.print("You still owe $"+debt+" and are "+months+" months late so we will come take your car or any other item of value.");
		}
		else {
			System.out.print("You still owe $"+debt+", so keep up the payments and we will not come and pull you out of class.");
		}
		//System.out.print(payYear+payMonth);
		
	}

}
