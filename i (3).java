
import java.util.Arrays;


public class i {
    public static void Majority(int array[]) 
    {
        int counter=0,n=array.length,i=0,j=0;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<n;j++)
               {
                  if(array[i]==array[j])
                   counter++;}
        }
        if(counter==n/2)
        System.out.println("majority element is "+j );
        else System.out.println("NO ELEMENT FOUND");
    }
    public static void main(String[] args) {
        int i=0; 
       
        int counter=1;
        int array[] = {12,3,3,4,3,7,45,9,54,64};
         int j=array.length;
        //Majority(array);
        Arrays.sort(array);
         //for(int a : array)
       // System.out.println("Sorted Elements are "+a);
        for(i=0;i<j-1;i++)
        {
            if( array[i+1]==array[i])
            {  counter++;
               System.out.println(array[i]+ " occurs "+ counter +" times ");
            }
            else
                array[i]=array[i+1];
            //System.out.println("Sorted Elements are "+array[i]);
            }
    }
}
     
