import java.io.IOException;
import java.util.Scanner;
//==============================================================================
// Program : Final Exam 1
// Student : Jared Richmond                                     <-------- YOUR NAME
// Date    : 5/8/2023
//==============================================================================
public class FinalExam2
{
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter class data (Class Code,Title,max seat, enrolled):");
		String data=kb.next();
		kb.nextLine();
		String[] dataSplit= data.split(",");
		int maxEnrollment=Integer.valueOf(dataSplit[3]);
		int enrollment=Integer.valueOf(dataSplit[2]);
		if (enrollment<=maxEnrollment) {
			System.out.println("You have been registered for class");
		} else {
			System.out.println("Enrollment exceeds maxinum seating limit");
		}
		kb.nextLine();
	    }
}
