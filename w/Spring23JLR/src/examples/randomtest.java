package examples;
import javax.swing.JOptionPane;
public class randomtest
  {
    public static void main(String args[])
      {
        int i;
        int ivar, upper = 30;
               
  	    for(i=1;i<=10;i++)  
           {
//            JOptionPane.showMessageDialog(null, "A random number: " + (1 + (int)(Math.random() * 10) ) );
               
               ivar = callRan(upper) ;
               System.out.println(ivar);      
           }
    
        System.exit(0);
      }// end main
           
      public static int callRan(int upper)  
      {
         return 1 + (int)(Math.random() * upper) ;
      }
      
  }//end class