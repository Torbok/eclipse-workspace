//==============================================================================
// Program : Lab Five
// Student : Jared Richmond                                     <-------- YOUR NAME
// Date    : 04/30/23
// Abstract: Find negative blocks
//==============================================================================
public class LabFive
{
  public static void main(String args[])
  {
    int grid[][] = {{ 5,-6, 5, 4, 3, 0, 3, 7, 0,-7},
                    {-9, 0, 3,-2, 5, 5, 1, 6,-7, 0},
                    { 5, 8, 8,-8, 6, 7, 3, 5, 6, 2},
                    { 7,-9,-3, 4, 3, 0, 2, 7, 8, 5},
                    {-9, 3, 1, 6,-8,-1, 7, 3, 6, 4},
                    { 6,-7, 1, 8,-1,-8, 5, 6, 9, 7},
                    { 0, 3, 7, 2, 8, 3, 2, 1, 6, 4},
                    { 1, 4, 4, 4, 9, 4,-8,-2, 7, 7},
                    {-9,-7, 4, 5, 4, 6, 7, 6,-2, 8},
                    { 4, 3, 7, 4, 9, 6, 3, 7,-9, 0}};

    System.out.println("\nShows row/col of upper left cell of block\n");
    System.out.println("row col sum");
    System.out.println("--- --- ---");
    checkGrid(grid);
  }
  //----------------------------------------------------------------------------
  public static void checkGrid(int grid[][])
  {
	int q1=0,q2=0,q3=0,q4=0;
	for (int row=0; row<10;row+=2) {
		for (int col=0; col<10;col+=2) {
	    	q1=grid[row][col];
	    	q2=grid[row][col+1];
	    	q3=grid[row+1][col];
	    	q4=grid[row+1][col+1];
	    	if ((q1+q2+q3+q4)<0) {
	    		System.out.println(" "+row+"   "+col+"  "+(q1+q2+q3+q4));
	    	}
	    }
	}
   }
}