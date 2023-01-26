package examples;
import javax.swing.JOptionPane;
public class overload11
  {
    public static void main(String args[])
      {
         int    inum = 5, jnum = 10, largest;
         
         
         largest = maxNum(inum, jnum);
         
         
      }// end of main method

    public static int maxNum(int vari, int vark)  
      {
         int largest;
         if (vari > vark)
          largest = vari;
         else 
          largest = vari;
         return largest;
      }
      