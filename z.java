import java.util.Stack;

public class z {
	
	public static void main(String args[])	{
				int arr[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9}};
		int MAX_ROW = 2;
		int MAX_COL = 2;
		Stack<Integer> stack = new Stack<Integer>();
		
		for ( int i = 0, j = 0 ; i <= MAX_ROW && j <= MAX_COL; i++ , j++ , MAX_ROW-- , MAX_COL-- ){
			
			int l,k;
			l=i;k=j;
			for (  ; k <= MAX_COL ; k++)
				stack.push(arr[l][k]);
			
			for ( l = i+1 , k = MAX_COL  ; l <= MAX_ROW ; l++)	
				stack.push(arr[l][k]);
			
			for ( l = MAX_ROW , k = MAX_COL - 1 ; k >= j ; k--  )
				stack.push(arr[l][k]);
			
			for ( l = MAX_ROW - 1 , k = j ; l > i ; l--)
				stack.push(arr[l][k]);
			
			
		}
		
		printAntiSpiralMatrix(stack);
	}

	private static void printAntiSpiralMatrix(Stack<Integer> stack ) {
		
		while (!stack.empty())
			System.out.print(stack.pop()+ " ");
        }}
/*

class Prime{  
 public static void main(String args[]){  
  int i,m=0,flag=0;    
  int n=br.read();//it is the number to be checked  
  m=n/2;    
  for(i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
}  
}  


*/





