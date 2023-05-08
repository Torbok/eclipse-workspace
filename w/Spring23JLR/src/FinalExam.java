import java.io.IOException;
import java.util.Random;

//==============================================================================
// Program : Final Exam 1
// Student : Jared Richmond                                     <-------- YOUR NAME
// Date    : 5/8/2023
//==============================================================================
public class FinalExam
{
	public static void main(String[] args) throws IOException {
		int intArray[]=fillArray(100,1,50);
		int divCount=arrayDiv(intArray);
		int divPosArray[]= new int[divCount];
		int tempStep=0,largest=0;;
		for (int x = 0;x<intArray.length;x++) {
			if (intArray[x]%2==0) {
				if (intArray[x]>largest) {
					largest=intArray[x];
				}
				divPosArray[tempStep]=x;
				tempStep+=1;
			}
		}
		System.out.println("Position		Element");
		for (int x=0;x<divPosArray.length;x++) {
			System.out.println(divPosArray[x]+"			"+intArray[divPosArray[x]]);
		}
		System.out.print("Largest number is: "+largest);
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
	public static int arrayDiv(int[] array)
	   {
		int tempCount=0;
		for (int x=0;x<array.length;x++) {
			if ((array[x]%2)==0) {
				tempCount+=1;
				System.out.print(array[x]);
				System.out.println(" is divisible by 2.");
			}
			
		}
		return (tempCount);
	   }
	    }
	
