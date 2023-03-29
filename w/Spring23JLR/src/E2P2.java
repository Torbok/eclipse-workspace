import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E2P2 {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName="scores.txt",fname="",lname="",lowfname="",lowlname="";
		int score=100,lowestScore=100;
		File file = new File(fileName);
	    Scanner inputFile = new Scanner(file);
	    while (inputFile.hasNext()) {
	    	fname=inputFile.next();
	    	lname=inputFile.next();
	    	score=inputFile.nextInt();
	    	System.out.print(fname+"	"+lname+"	"+score+"\n");
	    	if (score<lowestScore) {
	    		lowestScore=score;
	    		lowfname=fname;
	    		lowlname=lname;
	    	}
	    }
	    System.out.print("Lowest Score: "+lowfname+" "+lowlname+" "+lowestScore);
		inputFile.close();
	    System.exit(0);
	}

}

