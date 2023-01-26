package examples;
// Exercise5_5.java: Write a method to sum all integers in the
// major diagonal in a matrix of integers.
public class Exercise5_5 {
  // Main method
  public static void main(String[] args) {
    int[][] m = { 
      {1, 2, 4, 5},  
      {6, 7, 8, 9},  
      {10, 11, 12, 13},  
      {14, 15, 16, 17}};

    int sum = 0;

    for (int i = 0; i < m.length; i++)
    for (int j = 0; j < m.length[i]; j++)
    {
      sum += m[i][j];
   	 System.out.print("Sum of diagonal is " + sum + "   " + m[i][j]);
	}
  }
}