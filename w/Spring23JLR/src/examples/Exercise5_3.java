package examples;
// Exercise5_3.java: Write a method that finds the smallest element
// in an array of integers.
public class Exercise5_3 {
  // Main method
  public static void main(String[] args) {
    int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
    int[] list2 = new int[8];

  //  System.out.println("The min is " + min(list, list2) );
      min(list, list2);
    for (int i = 0; i<list.length; i++)
      System.out.println("The contents are " + list[i] );
 //   list2 = list;
    for (int i = 0; i<list.length; i++)
      System.out.println(list2[i]);  

  }

  public static int min(int[] list, int[] list2 ) {
    int min = list[0];

    for (int i = 1; i < list.length; i++)
      list2[i] = list[i];
      
      
 //    list2 = list;
     System.out.println(list2 + "   " + list);
 //   for (int i = 1; i < list.length; i++)
 //     System.out.println(list2[i]);
    list2[0] = 52;
    
    return min;
  }
}