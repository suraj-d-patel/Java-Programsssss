class a 
{
    // Function print matrix in spiral form
    static void spiralPrint(int bottom, int right, int a[][])
    {
        int i, top = 0, left = 0;
        /*  top - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
          
        while (top < bottom && left < right)
        {
            // Print the first row from the remaining rows
            for (i = left; i < right; ++i)
            {
                System.out.print(a[top][i]+" ");
            }
            top++;
  
            // Print the last column from the remaining columns 
            for (i = top; i < bottom; ++i)
            {
                System.out.print(a[i][right-1]+" ");
            }
            right--;
  
            // Print the last row from the remaining rows */
            if ( top < bottom)
            {
                for (i = right-1; i >= left; --i)
                {
                    System.out.print(a[bottom-1][i]+" ");
                }
                bottom--;
            }
  
            // Print the first column from the remaining columns */
            if (left < right)
            {
                for (i = bottom-1; i >= top; --i)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;    
            }        
        }
    }
     
    // driver program
    public static void main (String[] args) 
    {
         int R=4;
        int C=4;
        int a[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7 }};
        spiralPrint(R,C,a);
    }
}
 