import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class LabFour {

	public static void main(String[] args) throws IOException {
		String bestTeam="",team1="",team2="",fileName="baseball.txt";
		int bestDiff=0,team1Score=0,team2Score=0,diff=0;
		File file = new File(fileName);
	    Scanner inputFile = new Scanner(file);
	    while (inputFile.hasNext()) {
	    	team1=inputFile.next();
	    	team2=inputFile.next();
	    	team1Score=inputFile.nextInt();
	    	team2Score=inputFile.nextInt();
	    	if (team1Score>team2Score) {
	    		diff=team1Score-team2Score;
	    		System.out.println(team1+" beat "+team2+" by "+diff+" points.");
	    		if (diff>bestDiff) {
		    		bestDiff=diff;
		    		bestTeam=team1;
		    	}
	    	} else if (team1Score<team2Score) {
	    		diff=team2Score-team1Score;
	    		System.out.println(team2+" beat "+team1+" by "+diff+" points.");
	    		if (diff>bestDiff) {
		    		bestDiff=diff;
		    		bestTeam=team2;
		    	}
	    	} else if (team1Score==0||team2Score==0) {
	    		System.out.println(team1+" and "+team2+" didn't play this week");
	    	} else {
	    		System.out.println(team1+" tied with "+team2+", both scores being "+team1Score);
	    	}
	    }
	    System.out.println("\n"+bestTeam+" won by the most, with a "+bestDiff+" point difference!");
	    inputFile.close();
	    System.exit(0);
	}

}
