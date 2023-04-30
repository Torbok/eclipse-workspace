import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class prob5bYourLogin {
	public static void main(String[] args) throws IOException {
		String[] fNames = new String[3];
		String[] lNames = new String[3];
		int[] ages = new int[3];
		String fileName="names.txt";
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		inputFile.useDelimiter(",");
	    for (int x = 0;x<3;x++) {
	    		fNames[x]=inputFile.next();
	    		lNames[x]=inputFile.next();
	    		ages[x]=inputFile.nextInt();
	    }
	    for (int n = 0;n<fNames.length;n++) {
	    	if (n==0) {
	    		System.out.println("First Name	Last Name	Age");
	    	}
	    	System.out.println(fNames[n]+"		"+lNames[n]+"		"+ages[n]);
	    	//System.out.print(fNames[0]+fNames[1]+fNames[2]);
	    }
	    inputFile.close();
	    System.exit(0);
	}
}

