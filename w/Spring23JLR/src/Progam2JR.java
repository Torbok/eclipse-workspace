import java.util.Scanner;
public class Progam2JR {

	public static void main(String[] args) {
		//1/23/2023
		//Enter a dollar amount and determine least amount of bills to pay with
		Scanner kb = new Scanner(System.in);
		int hundreds,fifties,twenties,tens,fives,ones,amount;
		System.out.print("Enter a dollar amount: ");
		amount=kb.nextInt();
		kb.nextLine();
		hundreds=(amount-(amount%100))/100;
		amount=amount-(hundreds*100);
		fifties=(amount-(amount%50))/50;
		amount=amount-(fifties*50);
		twenties=(amount-(amount%20))/20;
		amount=amount-(twenties*20);
		tens=(amount-(amount%10))/10;
		amount=amount-(tens*10);
		fives=(amount-(amount%5))/5;
		amount=amount-(fives*5);
		ones=amount;
		//System.out.print(twenties+" "+tens+" "+fives+" "+ones);
		//Used to test
		System.out.println("$100 bills: "+hundreds);
		System.out.println("$50 bills: "+fifties);
		System.out.println("$20 bills: "+twenties);
		System.out.println("$10 bills: "+tens);
		System.out.println("$5 bills: "+fives);
		System.out.println("$1 bills: "+ones);
		System.out.println("Total Bills: "+(hundreds+fifties+twenties+tens+fives+ones));
	}

}
