import java.util.Scanner;
public class inClassWeight {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String priority;
		int weight,miles;
		double total=0,reg=0,over=0,rate=0;
		System.out.printf("Enter the weight of the package: ");
		weight=kb.nextInt();
		kb.nextLine();
		System.out.printf("Enter the distance travelled in miles: ");
		miles=kb.nextInt();
		kb.nextLine();
		System.out.printf("Would you like priority shipping? y/n: ");
		priority=kb.next();
		kb.nextLine();
		if (priority.equalsIgnoreCase("y")) {
			total=total+10.0;
		}
		if (weight<=2) {
			rate=1.10;
		}
		else if (weight<=6) {
			rate=2.20;
		}
		else if (weight<=10) {
			rate=3.70;
		}
		else {
			rate=3.80;
		}
		if (miles>500) {
			over=1.50;
			miles=miles-(miles%500);
		}
		reg=(miles/500)*rate;
		total=total+reg+over;
		System.out.printf("Regular shipping charges: $%,.2f\n", reg);
		System.out.printf("Overage shipping charges: $%,.2f\n", over);
		System.out.printf("Total   shipping charges: $%,.2f\n", total);
	}

}
