import java.util.*;

class test4 
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    int i, j;
		    char a[]=new char[1000];
		    char b[]=new char [1000],tmp;
		    int n=s.length(), x=0, y=0;
		    for(i=0;i<n;i++)
		    {
		        
		        if(Character.isUpperCase(s.charAt(i)))
		        a[x++]=s.charAt(i);
		        else
		        b[y++]=s.charAt(i);
		    }
		    for(i=0;i<x;i++)
		    {
		        for(j=0;j<x-i-1;j++)
		        {
		            if(a[j]>a[j+1])
		            {
		                tmp=a[j];
		                a[j]=a[j+1];
		                a[j+1]=tmp;
		            }
		        }
		    }
		    for(i=0;i<y;i++)
		    {
		        for(j=0;j<y-i-1;j++)
		        {
		            if(b[j]>b[j+1])
		            {
		                tmp=b[j];
		                b[j]=b[j+1];
		                b[j+1]=tmp;
		            }
		        }
		    }
		    i=0;j=0;
		    while(i<x&&j<y)
		    {
		        System.out.print(a[i++]);
		        System.out.print(b[j++]);
		    }
		    while(i<x)
		    {
		        System.out.print(a[i++]);
		    }
		    while(j<y)
		    {
		        System.out.print(b[j++]);
		    }
		    System.out.println();
		}
		
	}
}