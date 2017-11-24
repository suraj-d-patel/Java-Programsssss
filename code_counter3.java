/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SURAJ D PATEL
 */
import java.util.*;
public class code_counter3 {

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

        //System.out.println("Hello World!");
        String[] array = new String[7];
        String[] array2 = new String[7];
        
        Scanner s = new Scanner(System.in);
        int i,j,k,index=0,count=0;
        
            
            String a= s.nextLine();
        
        while(array[index] ==array[index+1] )
        {
           count++;
           array[index] = array2[index];
            index++;
        }
            
                   if(array2.length<array2.length)
                       System.out.println(array2.length);
                           else
                       System.out.println(array.length);
       
}
}
