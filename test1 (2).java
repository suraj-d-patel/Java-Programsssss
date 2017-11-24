import java.util.*;

class test1 {
	public static void main (String[] args) 
        {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
                {
			String sub=sc.next();
			String s=sc.next();
			if(s.lastIndexOf(sub)!=-1)
                        {
			System.out.println(s.lastIndexOf(sub)+1);	
			}else
                        {
			System.out.println(-1);	
			}
			t--;
		}
		
	}
}