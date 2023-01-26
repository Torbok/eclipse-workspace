package examples;
// Exercise5_11.java: Binary search using iteration
import javax.swing.JOptionPane;

public class Exercise5_11 {
  public static void main(String[] args) {
    int[] list = new int[10];

    // Create a sorted list and display it
    System.out.print("The list is  ");
    for (int i = 0; i < list.length; i++) {
      list[i] = 2 * i + 1;
      System.out.print(list[i] + "  ");
    }
    System.out.println(" ");

    // Prompt the user to enter a key
    String keyString = JOptionPane.showInputDialog(null, 
      "Enter a key:", 
      "Exercise5_11 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string into integer
    int key = Integer.parseInt(keyString);

    int index = binarySearch(key, list);
    if (index != -1)
      System.out.println("The key is found in index "+index);
    else
      System.out.println("The key is not found in the list");
    
    System.exit(0);
  }

  public static int binarySearch(int key, int[] list) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high)/2;
      if (key < list[mid])
        high = mid - 1;
      else if (key == list[mid])
        return mid;
      else if (key > list[mid])
        low = mid + 1;
    }

    return -1;
  }
}