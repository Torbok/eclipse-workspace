package examples;// method_1_1.java  send one, get back one
import javax.swing.JOptionPane;
public class scopetest2
  {
    public static void main(String args[])
      {
         int num = 5;
         
         System.out.println("Before call " + num);
         sqr_it(num);    
         System.out.println("After  call " + num);  //after the call is unchanged
	     
      }// end of main method

      
    public static void sqr_it(int num)  //new storage, not the same num as above 
      {                                 //but does have the same number in it
         num = num * num;       
         System.out.println("In the call " + num);
         
      }
	  	  
  }