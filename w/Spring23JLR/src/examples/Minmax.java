package examples;
// A comparison program.

// Java extension packages
import javax.swing.JOptionPane;  // import class JOptionPane

public class Minmax {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String firstNumber;   // first string entered by user
      String secondNumber;  // second string entered by user
      String thirdNumber;   // first string entered by user
      String fourthNumber;  // second string entered by user
      String fifthNumber;  // second string entered by user
      int number1;          // first number to add
      int number2;          // second number to add
      int number3;          // first number to add
      int number4;          // second number to add
      int number5;          // second number to add
      int max;              // max number
      int min;		    // min number 	

      // read in first number from user as a string
      firstNumber =
         JOptionPane.showInputDialog( "Enter first integer" );

      // read in second number from user as a string
      secondNumber =
         JOptionPane.showInputDialog( "Enter second integer" );

      // read in third number from user as a string
      thirdNumber =
         JOptionPane.showInputDialog( "Enter third integer" );

      // read in fourth number from user as a string
      fourthNumber =
         JOptionPane.showInputDialog( "Enter fourth integer" ); 
      
      // read in fifth number from user as a string
      fifthNumber =
         JOptionPane.showInputDialog( "Enter fifth integer" );

      // convert numbers from type String to type int
      number1 = Integer.parseInt( firstNumber ); 
      number2 = Integer.parseInt( secondNumber );
      number3 = Integer.parseInt( thirdNumber ); 
      number4 = Integer.parseInt( fourthNumber );
      number5 = Integer.parseInt( fifthNumber ); 
      

      // set the numbers
      max = number1;
      min = number1;

// find the max with if statements
      max = findMax(max, number2, number3, number4, number5);
     
// find the minwith if statements
      min = findMin(min, number2, number3, number4, number5);
      

      // display the results
      JOptionPane.showMessageDialog(
         null, "The max number is  " + max + "\nThe min number is " +
         min  , "Results",
         JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );   // terminate application

   }  // end method main
     
   public static int findMax(int max, int number2,int number3, int number4, int number5)
    { 
    if (max < number2)
         max = number2;
      if (max < number3)
         max = number3;
      if (max < number4)
         max = number4;
      if (max < number5)
         max = number5;
      return max;
 }
 
 public static int findMin(int min, int number2,int number3, int number4, int number5)
 
 {
   if (min > number2)
         min= number2;
      if (min > number3)
         min = number3;
      if (min > number4)
         min = number4;
      if (min > number5)
         min = number5;
     return min;
}
}  // end class Minmax

