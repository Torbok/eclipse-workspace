package examples;
/**
   This program demonstrates passing individual array
   elements as arguments to a method.
*/

public class MatchArrays
{
   public static void main(String[] args)
   {
      int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

      for (int index = 0; index < numbers.length; index++)
         showValue(numbers[index]);
      String [] letters = {"abc", "def", "hij", "klm"}; 
      matchArrays(letters, numbers);
           
   }

   /**
      The showValue method displays its argument.
      @param n The value to display.
   */

   public static void showValue(int n)
   {
      System.out.print(n + " ");
   }
   
   public static void matchArrays(String [] letters, int[] n)
   {  String hold = "abc";
	  for (int i = 0; i < letters.length; i++){
		    String shold = letters[i];
         if (shold.equals(hold))
             System.out.println("equals works for " + letters[i]);
         if (shold == hold)
             System.out.println("== works for " + letters[i]); 
         }    
   }
}