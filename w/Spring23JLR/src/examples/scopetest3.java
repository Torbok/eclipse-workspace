package examples;// method_1_1.java  send one, get back one
import javax.swing.JOptionPane;
public class scopetest3
  {
    public static void main(String args[])
      {
         int num = 5;
         
         System.out.println("Before call " + num);
         sqr_it(num);    
         System.out.println("After  call " + num);  //after the call is unchanged
	     
      }// end of main method

      
    public static void sqr_it(int ivar)  
      {
         int num;              //not the same num, new storage
         num = 10;       
         System.out.println("In the call " + num);
      }
	  	  
  }