package examples;
import javax.swing.JOptionPane;
public class overload3
  {
    public static void main(String args[])
      {
         int    ivar =  10;
         double dvar = 1.5;
         double result;
         
         result = do_something( ivar, dvar);
         System.out.println("1st sum: " + result);
         
         result = do_something( dvar, ivar);
         System.out.println("2nd sum: " + result);
         
      }// end of main method

    public static double do_something(int vari, double vard)  
      {
	     double num;
	     num = vari + vard;
	     return num;
      }
      
    public static double do_something(double vard, int vari)  
      {
	     double num;
	     num = vari * vard;
	     return num;
      }
  }