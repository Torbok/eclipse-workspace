import java.text.DecimalFormat; // Needed for DecimalFormat

/**
 * This program demonstrates the DecimalFormat class.
 */

public class FormatPrintf
{
   public static void main(String[] args)
   {
      double number1 = 14442,
      		 number2 = 1.666666666666667,
             number3 = 16.666666666666667,
             number4 = 166.6642,
             number5 = 1666666.6675,
             number6 = 453;       

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("#0.00");

      // Format and display the variables.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
      System.out.println(formatter.format(number5));
      System.out.println();
      System.out.printf("this is using the printf %.2f %5.2f\n", number1, number2);	
      System.out.printf("this is using the printf %5.2f\n", number2);
      System.out.printf("this is using the printf %5.2f\n", number3);
      System.out.printf("this is using the printf with a 5.2 %5.2f\n", number4);
      System.out.printf("this is using the printf with a comma $%,.2f\n", number5);
      System.out.printf("this is using the printf %6.2f\n", number6);
      System.out.printf("big number get smaller %1.2f\n", number6);
   }
}
