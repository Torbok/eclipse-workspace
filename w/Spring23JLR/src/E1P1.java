import java.util.Scanner;

public class E1P1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float percent;
		int students,positive;
		System.out.print("Enter the amount of students in the university: ");
		students=kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the amount of students who tested positive for covid: ");
		positive=kb.nextInt();
		kb.nextLine();
		percent=100*((float)positive/(float)students);
		System.out.println(students+" University Students");
		System.out.print(positive+" positive for virus -- ");
		System.out.printf("%,.0f percent",percent);
		kb.close();
		System.exit(0);
	}

}

