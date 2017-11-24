public class spiral {
    public static void Spiral(int array[][], int row, int column)
    {
        int top =0,bottom = row-1,left = 0,right = column-1;
        int direction = 0;
        while(top<=bottom && left <=right)
        {
            if(direction==0)
            {
                for(int i =left;i<=right ;i++)
                {
                    System.out.println(array[top][i]);
                }
                direction++; top++;
            }
            
            else  if(direction==1)
            {
                for(int i =top;i<=bottom ;i++)
                {
                    System.out.println(array[i][right]);
                }
                direction=2 ; right--;
            }
            
            else  if(direction==2)
            {
                for(int i =right;i>=left ;i--)
                {
                    System.out.println(array[bottom][i]);
                }
                direction = 3; bottom--;
            }
            
             else if(direction==3)
            {
                for(int i =bottom;i>=top ;i--)
                {
                    System.out.println(array[i][left]);
                }
                direction=0;left++;
            }
            
        }
    }
       public static void main(String[] args) {
        int r=4;
        int c=4;
        int a[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7 }};
        Spiral(a,r,c);
    }
}
