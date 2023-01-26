import java.util.Scanner;
public class Program1JR {

	public static void main(String[] args) {
		//1/23/2023
		//Calculates total of a meal with tax
		int food,tipPercent,taxPercent;
		double tipAmount,total,taxAmount;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the $ amount of the food: ");
		food=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the tip percentage: ");
		tipPercent=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the sales tax percentage: ");
		taxPercent=kb.nextInt();
		kb.nextLine();
		//System.out.println(food+" "+tipPercent+" "+taxPercent);
		//Used this to verify that I collected input correctly
		tipAmount=(tipPercent*0.01)*food;
		taxAmount=(taxPercent*0.01)*food;
		total=tipAmount+taxAmount+food;
		System.out.printf("Tip: $%,.2f\n", tipAmount);
		System.out.printf("Tax: $%,.2f\n", taxAmount);
		System.out.printf("Total: $%,.2f\n", total);
	}

}
