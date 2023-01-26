package examples;
import javax.swing.JOptionPane;
public class overload2
  {
    public static void main(String args[])
      {
         int    num1 =  5;
         int    num2 = 10;
         int    num3 =  2;
         int    num4 =  3;
         int    total;         
         
         total = sum_um(num1,num2);
         System.out.println("1st sum: " + total);
         
         total = sum_um(num1,num2,num3);
         System.out.println("2nd sum: " + total);
         
         total = sum_um(num1,num2,num3,num4);
         System.out.println("3rd sum: " + total);
         
      }// end of main method

    public static int sum_um(int var1, int var2)  
      {
	     int sum;
	     sum = var1 + var2;
	     return sum;
      }
      
    public static int sum_um(int var1, int var2, int var3)  
      {
	     int sum;
	     sum = var1 + var2 + var3;
	     return sum;
      }
      
    public static int sum_um(int var1, int var2, int var3, int var4)  
      {
	     int sum;
	     sum = var1 + var2 + var3 + var4;
	     return sum;
      }
  }