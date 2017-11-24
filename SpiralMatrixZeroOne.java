import java.io.*;

public class SpiralMatrixZeroOne
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of matrix : ");
        int n=Integer.parseInt(br.readLine());
        int A[][]=new int[n][n];
        int value=1, col_start=0, col_end=n-1, row_start=0, row_end=n-1,fill = 1;

        while(value<=n*n)
        {

            for(int i=col_start;i<=col_end;i++)
            {
                A[row_start][i]=fill;
            }

            for(int j=row_start+1;j<=row_end;j++)
            {
                A[j][col_end]=fill;
            }

            for(int i=col_end-1;i>=col_start;i--)
            {
                A[row_end][i]=fill;
            }

            for(int j=row_end-1;j>=row_start+1;j--)
            {
                A[j][col_start]=fill;
            }
            value+=4;
            col_start++;
            col_end--;
            row_start++;
            row_end--;
            if(fill==1)
            {
                fill = 0;
            }
            else
            {
                fill = 1;
            }
        }
        /* Printing the Circular matrix */
        System.out.println("The Circular Matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]+ "\t");
                }
            System.out.println();
        }
    }
}