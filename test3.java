import java.io.*;

class test3
{
	public static void main (String[] args) throws Exception
	{
	    InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader   br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        while(T>0)
        {
        String s = br.readLine();
        String s1 = br.readLine();
       /* if(s.length() > s1.length() )
        {
        System.out.println(s.lastIndexOf(s1));
        }
        
         else if(!s.contains(s1))
         {
             System.out.println(s.lastIndexOf(s1));
         }
         */
         if(s.lastIndexOf(s1)!=-1){
			System.out.println(s.lastIndexOf(s1));	}
         else
         {
              System.out.println(-1);
         }
        T--;
        }

	}
}