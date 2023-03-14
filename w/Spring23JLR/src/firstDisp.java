/* basic layout to variables
*/
public class firstDisp
{
   public static void main(String[] args){ 
	   for (int i = 0; i < 3; i++)
	   {
	       for (int j = 0; j < 2; j++)
	       {
	           if (i == j)
	               continue;
	           System.out.println("i = " + i + " j = " + j);
	       }
	   }
}}