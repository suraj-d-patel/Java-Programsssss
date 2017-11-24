import java.io.*;
class descending
{
 public static void main(String args[]) throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int a,b,c;
      System.out.println("Enter 3 numbers ");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      c=Integer.parseInt(br.readLine());
      
      int small,med,large;
      small=0;
      med=0;
      large=0;
      if(a<b && a>c)
          {
              large=a;
              if(b>c)
              {
                  med=b;
                  small=c;
              }
              else
              {
                  med=c;
                  small=b;
              }
          }
      else if(b>a && b>c)
                 {
                     large=b;
                     if(a>c)
                     {med=a;
                     small=c;
                     }
                     else{
                         med=c;
                         small=a;
                     }
                 }
      else if (c>a && c>b)
                 {
                     if(a>b)
                     {
                         med=a;
                     small=a;
                     }
                     
                     }
         System.out.println("Number in descending order are "+large +"," +med +"," +small);
}
}
