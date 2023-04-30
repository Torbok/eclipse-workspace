import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class prob5aYourLogin {
	public static void main(String[] args) throws IOException {
		int intArray[]=fillArray(10,1,9);
		arrayDiv(intArray);
	    System.exit(0);
	}
	public static int[] fillArray(int i,int min,int max)
	   {
		Random rand=new Random();
		int tempArray[]=new int[i];
		for (int n = 0; n<i;n++)  {
	    	  tempArray[n]=rand.nextInt(max)+min;
	    	  //System.out.print(tempArray[n]);
	      }
		return tempArray;
	   }
	public static void arrayDiv(int[] array)
	   {
		int prevVal,curVal,result;
		for (int n = 0;n<=array.length;n++) 
		{
			curVal=array[n];
			if (n!=0) {
				prevVal=array[n-1];
			} else {
				prevVal=1;
			}
			result=(int)curVal/prevVal;
			if (result<1) {
				result=1;
			}
			System.out.print("Division of "+curVal+" by "+prevVal+" is "+result+": ");
			for (int i=0;i<result;i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	   }
}
