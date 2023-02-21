import java.util.Scanner;

public class E1P2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String query;
		int adult,child;
		double adultPrice,childPrice,total,preTotal;
		adultPrice=73.50;
		childPrice=28.50;
		System.out.print("Enter the amount of adult tickets: ");
		adult=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the amount of child tickets: ");
		child=kb.nextInt();
		kb.nextLine();
		total=(adult*adultPrice)+(child*childPrice);
		preTotal=total;
		if (child>3) {
			total=total-(total*.3);
		} else if (child==3) {
			total=total-(total*.1);
		}
		System.out.print("Do you want the two day package? (y/n): ");
		query=kb.next();
		kb.nextLine();
		if (query.equals("y")) {
			total=total*1.5;
			preTotal=preTotal*1.5;
		}
		System.out.println("Children: "+child);
		System.out.println("Adults: "+adult);
		System.out.printf("Total w/out disount: $%,.2f\n",preTotal);
		System.out.print("2-day package: ");
		if (query.equals("y")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.printf("Total w/ disount: $%,.2f\n",total);
		kb.close();
		System.exit(0);
	}

}

