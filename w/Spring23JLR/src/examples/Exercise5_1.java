package examples;
// Exercise5_1.java: Enter 10 integers and
// display the numbers in reverse order
import javax.swing.JOptionPane;

public class Exercise5_1 {
  public static void main (String[] args) {
  
    int[] num = new int[5];
    int[] numList = new int[5];
    
    for (int i = 0; i < 5; i++) {
      // Read a number
      String dataString = JOptionPane.showInputDialog(null, 
        "Read a number:",
        "Exercise5_1", JOptionPane.QUESTION_MESSAGE);

      num[i] = Integer.parseInt(dataString);
    }

    // Display the array
    for (int i = 4; i >= 0; i--) {
      System.out.println(num[i]);
    }
    
    System.exit(0);
  }
}