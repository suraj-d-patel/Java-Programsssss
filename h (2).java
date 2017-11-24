import java.util.*;
public class h {
    public static void ArrayHasSum(int n,int array[],int sum)
    {
        Arrays.sort(array);
        int l=0,r=n-1;
        for(int i=l;i<=r;i++)
           {
             if(array[l]+array[r]<sum)
                l++;
            
            else if(array[l]+array[r]==sum)
            {System.out.println("Elements found that is " + array[l] +" and "+ array[r]);}
              else r--;
             }
    }
    public static void main(String[] args) {
   int array[] = {-12,1,62,-100,3,54,67,87};
   int n= array.length;
   int sum=63;
      //System.out.println(n);
      ArrayHasSum(n,array,sum);
      //if( ArrayHasSum(n,array,sum))
          //System.out.println("Elements found");
    // else
          // System.out.println("No Element Found");
}
}
