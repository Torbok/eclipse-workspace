import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int startVal=0;
		int endVal=0;
		int primeTotal=0;
		boolean isPrime=false;
		Scanner kb = new Scanner(System.in);
		while ((startVal<=0) || (startVal%10!=0)) {
			System.out.printf("Enter the Starting Number of the Range (ex. 10, 70, 100): ");
			startVal=kb.nextInt();
			kb.nextLine();
		}
		while ((endVal<=0) || (endVal%10!=0)) {
			System.out.printf("Enter the Ending Number of the Range (ex. 10, 70, 100): ");
			endVal=kb.nextInt();
			kb.nextLine();
		}
		for (int i = startVal+1; i <= endVal; i++) {
			isPrime=true;
			for (int divisor = 1; divisor <=i; divisor++) {
				//System.out.println(i+"/"+divisor+" remainder is "+i%divisor);
				if ((i%divisor==0) && (divisor!=i) && (divisor!=1)){
					isPrime=false;
				}
			}
			if (isPrime==true) {
				System.out.printf("%3d",i);
				primeTotal++;
			}
			else if (i%10==0) {
				System.out.println(" - | "+i);
			}
			else {
				System.out.print(" - ");
			}
		}
		System.out.printf("There are %d prime numbers between %d and %d",primeTotal,startVal,endVal);
		kb.close();
		System.exit(0);
	}

}
