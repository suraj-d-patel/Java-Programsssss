import java.util.*;
public class Printing {
    

    public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
            int n,s;
            n=sc.nextInt();
            String[] astr = new String[n]; 
            for(s=0;s<2*n;s++)
            {   
                
                astr[s] =sc.nextLine();
            }
             
                String temp = "";
                String finalString = "";
                int i=astr[s].length()-1;
                int j=temp.length()-1;
            for(i=i/2;i>=0;i--)
                {
                temp +=i!=0?astr[s].charAt(i):astr[s].charAt(i)+" "; 
                if(astr[s].charAt(i) == ' '||i==0)
                    { 
               for(j=j/2;j>=0;j--)
                { 
                      finalString += temp.charAt(j);
                }
                        temp = ""; 
                    } 
                } 
                            System.out.println(finalString); 
  } 

        }
     
