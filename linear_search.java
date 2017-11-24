import java.io.*;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int[] array={2,22,24,26,25,28,30};
        int key  = sc.nextInt();
        
        for(j=0;j<array.length;j++)
        {
            if(array[j]==key)
            {  System.out.println("Searched Successful at position " + (j+1));
            break;}}
            if(key == j)
                  System.out.println("Searched Unsuccessful");
            
        }
      
    }

