package examples;// method_1_1.java  send one, get back one
import javax.swing.JOptionPane;
public class scopetest1
  {
    public static void main(String args[])
      {
         String snum;
         int num;
         int sqrd_num;
                  
	     snum = JOptionPane.showInputDialog("Enter a number");
	     num = Integer.parseInt(snum);
	     
	     sqrd_num = sqr_it(num);
	     
	     JOptionPane.showMessageDialog(null,"The square of that number is " + sqrd_num);
	     	     
	     System.exit(0);
	     
      }// end of main method

      
    public static int sqr_it(int num)   
      {
       //  int sqrd_num;
         
         sqrd_num = num * num;
         
         return sqrd_num;
      }
	  	  
  }