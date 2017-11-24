import java.io.*;
public class test2 
{
    public static void main(String args[])throws Exception
    {  
    
      InputStreamReader r=new InputStreamReader(System.in);  
      BufferedReader br=new BufferedReader(r);  
      String s = br.readLine();
     
      String s1 = br.readLine();
        System.out.println("Last Index of substring is" + s.lastIndexOf(s1));
    
}
}
