import java.io.*;
class companybill 
{
  public static void main(String args[]) throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);

         int n;
         double bill;
         bill=0;
         System.out.println("Enter the number of calls");
         n=Integer.parseInt(br.readLine());
         if(n>=100)
         {
             bill=n*0;
         }
         else if(n>=101&&n<200)
         {
             bill=((100*0)+(n-100)*0.40);
         }
         else if(n>=201&&n<=300)
         {
             bill=(100*0)+(100*0.40)+(n-200)*0.80;
         }
         else if(n>300)
         {
             bill=(100*0)+(100*0.40)+(100*0.80)+(n-300)*1.20;
         }
         bill=bill+99;
         System.out.println("bill Amount =" + bill);
         }
 }