/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
class k {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++)
        {  array[i] = s.nextInt();}
        // for(int b : array)
         //System.out.print(b +" ");
         
         int[] array2 = new int[N];
        for(int i=0;i<N;i++)
        {  array2[i] = s.nextInt();}
         //for(int c : array2)
         //System.out.print(c +" ");
         System.out.println();
         int[] arraysum = new int[N];
        for(int i=0;i<N;i++)
         arraysum[i] =  array[i] + array2[i];
            
            for(int d : arraysum)
         System.out.print(d +" ");
    }
}
