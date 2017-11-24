
import java.io.*;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
*/

class hackerearth {
    public static void main(String args[] ) throws Exception {
       
    int n;
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  String line = br.readLine();
        //int N = Integer.parseInt(line);

       System.out.println("ENTER NO OF TEST CASES");
      int T = Integer.parseInt(br.readLine());
       n = Integer.parseInt(br.readLine());
       for(int j = 0; j<=T; j++)
	{
	    if(n%15 == 0)
	    System.out.println("FizzBuzz");
	    else if(n%5 == 0)
	    System.out.println("Buzz");
	     else if(n%3 == 0)
	    System.out.println("Fizz");
	    else
                 System.out.println(n);
	}

        //System.out.println("Hello World!");
    }
}
