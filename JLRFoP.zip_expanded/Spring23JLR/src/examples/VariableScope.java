package examples;
import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates how variables can be declared
 * in various locations throughout a program.
 */

public class VariableScope
{
   public static void main(String [] args)
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      int years = 0;
      // Get the annual income.
      System.out.print("What is your annual income? ");
      double income;  // Annual income
      income = keyboard.nextDouble();
 
  
         // Determine whether the user qualifies.
      if (income >= 35000)
      { 	 years = 0;   // Years on the job
             System.out.println("For how many years have you ");
    	 	 System.out.print("worked on your current job? ");
     		 years = keyboard.nextInt();
         if (years > 5)
         {  	         
            System.out.println("You qualify.");
        }
    
         else
         {
            System.out.println("You must have been employed for ");
            System.out.println("more than 5 years to qualify.");
         }
      }  
      else 
          
           if (years > 15) 
              System.out.println("You qualify.");
         
      		else
             	System.out.println("You will never qualify.");   
      
      System.out.println("You  have been employed for ");
      System.out.println( years+ " years ");
 

   }
}