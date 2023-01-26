package examples;
// Exercise 5.20 Solution: Diamond.java
// Program prints a diamond with minimal output statements

public class Diamond {

   public static void main( String args[] )
   {
      int row, stars, spaces;
      String diamondString = "";

      // top half (1st five lines)
      for ( row = 1; row <= 5; row++ ) {

         for ( spaces = 5; spaces > row; spaces-- )
            diamondString += " " ;

         for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
            diamondString += "*" ;

         diamondString += "\n" ;
      }

      // bottom half (last four rows)
      for ( row = 4; row >= 1; row-- ) {

         for ( spaces = 5; spaces > row; spaces-- )
            diamondString += " " ;

         for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
            diamondString += "*" ;

         diamondString += "\n" ;
      }

      // display result
      System.out.println( diamondString );

      System.exit( 0 );
   }

}  // end class Diamond