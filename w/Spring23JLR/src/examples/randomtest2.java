package examples;
import javax.swing.JOptionPane;
public class randomtest2
  {
    public static void main(String args[])
      {
        int i;
        
	    for(i=1;i<=10;i++)  
            System.out.println(                                       1 + (int)(Math.random() * 6) );

        
        System.exit(0);
      }

      
      
  }//end class