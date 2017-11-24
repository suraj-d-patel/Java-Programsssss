import java.io.*;
class lcm 
{
    public static void main(String args[]) throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader    br=new BufferedReader(isr);
      int a,b,i;
      System.out.println("Enter 2 numbers ");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());

 for(i=1; ;i++)
 {
     if(i%a==0 && i%b==0)
     {
         System.out.println("LCM is"+i);
         break;
     }
 }
 }
 
 }
