
import java.io.*;
public class i {
    public static void main(String[] args)throws IOException {
        System.out.print("Enter the number ");
        int n=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[][] arr= new int[n][n]; 
        int value=1,start_row =0,end_row=n-1,start_col =0,end_col=n-1,fill=1;
        while(value<=n*n)
        {
            for (int i = start_col; i <= end_col; i++) {
               arr[start_row][i] =fill;
            }
            for (int j = start_row+1; j <= end_row; j++) {
               arr[j][end_col] =fill;
            }
            for (int i = end_col-1; i >=start_col; i--) {
               arr[end_row][i] =fill;
            }
            for (int j = end_row-1; j >=start_row+1; j--) {
               arr[j][start_col] =fill;
            }
            value+=4;
            start_row++;
            end_col--;
            end_row--;
            start_col++;
//                start_col++;
//            end_col--;
//            start_row++;
//            end_row--;
//            
            if(fill==1)
            {
                fill=0;
            }
            else 
            {  fill=1;}
        }
        
            
        
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[j][k]+"\t"); 
           }
            System.out.println();
        }
        
    }
}
