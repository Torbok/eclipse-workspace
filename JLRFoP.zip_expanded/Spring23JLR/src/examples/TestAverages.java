/**
 * This program demonstrates a user controlled loop.
 */
package examples;

import java.util.Scanner;


import java.util.*;
public class TestAverages
{
     public static void main(String [] args)
     {
          int numStudents,             // The number of students
              score1, score2, score3,  // Three test scores
              count;                   // Loop control variable
          double average;              // Average test score

          System.out.println("This program averages 3 test scores");
          System.out.print("per student. How many students do "
                           + "you have? ");
		  Scanner keyboard = new Scanner(System.in);
          // Get the number of students.
          numStudents = keyboard.nextInt();

          // Start count at 1.
          count = 1;

          // Process the test scores for each student.
          System.out.println("Enter 3 scores for each student.");
          while (count <= numStudents)
          {
               // Get the three test scores for a student.
               System.out.println("Student #" + count);
               System.out.print("Enter score #1: ");
               score1 = keyboard.nextInt();
               System.out.print("Enter score #2: ");
               score2 = keyboard.nextInt();
               System.out.print("Enter score #3: ");
               score3 = keyboard.nextInt();

               // Calculate and print the average test score.
               average = (score1 + score2 + score3) / 3.0;
               System.out.println("The average is " + average);
               System.out.println();

               // Increment the control variable.
               count++;
          }
     }
}
