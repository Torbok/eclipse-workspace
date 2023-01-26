package examples;/**
   This program demonstrates passing individual array
   elements as arguments to a method.
*/

public class PassElements
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
   {
	  for (int i = 0; i < letters.length; i++){
         if (letters[i].equals("abc"))
             System.out.println("equals works for " + letters[i]);
         if (letters[i] == "abc")
             System.out.println("equals works for " + letters[i]); 
         }    
   }
}