package examples;
import javax.swing.JOptionPane;
public class overload1
  {
    public static void main(String args[])
      {
         int    inum = 5;
         double dnum = 1.2;
         
         sqr_it(inum);
         sqr_it(dnum);
         
      }// end of main method

    public static void sqr_it(int vari)  
      {
         System.out.println("Square of an int " + vari * vari);
      }
      
    public static void sqr_it(double vard)  
      {
         System.out.println("Square of a double " + vard * vard);
      }
	  	  
  }