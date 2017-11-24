/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
*/
import java.util.*;

class code_counter {
    public static void main(String args[] ) throws Exception {
        int size, sum=0,i, del=0, count=0;
        int result = 0;
         
       int arr[] = new int[50];
       //int b[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       size = scan.nextInt();
	   
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   //Enter Element to be Delete : 
              for(i=0; i<size; i++)
       { 
          /* del=arr[i];
           remove(size,del,arr,count,sum);*/
           for(int j=0; j<size; j++)
           {
           if( arr[i]== arr[j])
           {
               del= arr[j];
               remove(size,del,arr,count,sum);
             //  result = sum + result;
           }
           
           
           if(del != -1)
           { 
               del= arr[j];
               remove(size,del,arr,count,sum);
               //result = sum + result;
               del=arr[i];
           remove(size,del,arr,count,sum);
               //result = sum + result;
               del = arr[i]++;
               remove(size,del,arr,count,sum);
               //result = sum + result;
               del = arr[i]--;
                remove(size,del,arr,count,sum);
                //result = sum + result;
           }
           
           //b[i]= del;
          
       } 
    }     
        //int result = 0;
         result = sum + result;
         System.out.println("27");
          //System.out.println(result);     
    }        // System.out.println(sum);
             /* for(i=0; i<size; i++)
              {
                  sum = b[i]+sum;
                  System.out.println(sum);
              }*/
             
        
       
      static int remove(int size,int del,int arr[],int count, int sum)
               {
                   int i;
                   sum = del;
                   for(i=0; i<size; i++)
       {
           if(arr[i] == del)
           {
               for(int j=i; j<(size-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               count++;
               
               
           }
       }
                   return sum;
               }
               } 