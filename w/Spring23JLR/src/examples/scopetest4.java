package examples;
import javax.swing.JOptionPane;
public class scopetest4
  {
	static int num;
    public static void main(String args[])
      {
         int num = 5;
         
         System.out.println("Before call     " + num);
         use_local_var();    
         System.out.println("After 1st call  " + num);  //after 1st call is unchanged
         use_class_var();
         System.out.println("After 2nd call  " + num);  //after 2nd call is unchanged
         
      }// end of main method

    public static void use_local_var()  
      {
         int num;              //not the same num, new storage
         num = 10;       
         System.out.println("In 1st call    " + num);
      }
      
    public static void use_class_var()  
      {
         num = 15;       
         System.out.println("In 2nd call    " + num);
      }
	  	  
  }