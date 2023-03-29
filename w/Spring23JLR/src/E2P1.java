import java.util.Scanner;

public class E2P1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int columns=0;
		while (columns<=0||columns>9) {
		System.out.print("Enter a number between 1 and 9: ");
		columns=kb.nextInt();
		kb.nextLine();
		}
		for (int i = 0; i<=columns;i++) {
			for (int x = 1; x<=i; x++) {
				System.out.print(x);
			}
			System.out.print("\n");
		}
		kb.close();
		System.exit(0);
	}

}

