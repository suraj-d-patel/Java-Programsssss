//import java.util.Scanner;
//import java.util.Arrays;
//
//class MostFreq {
//    
//    private static void mostFreq3(int a[], int n, int b[]) {
//        int tempc,temp,count = 1;
//    for(int i = 0; i<n;i++)
//    {   tempc = 0;
//        temp =a[i]; 
//        tempc++;
//           for(int j=i+1; j<n;j++)
//           {
//               if(a[j]==temp)
//               {
//                   tempc++;
//                   if(tempc>count)
//                   {
//                       b[i]= temp;
//                       count = tempc;
//                   }
//               }
//           }
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//}
//    public static void main(String[] args) {
//	int n;
//	int b[] = new int[3];
//	int i=0;
//
//	Scanner scan = new Scanner(System.in);
//	n = scan.nextInt();
//	int a[] = new int[n];
//	for(i=0;i<n;i++) 
//		a[i] = scan.nextInt();
//
//	mostFreq3(a,n,b);
//
//	for(i=0;i<3;i++)
//		System.out.print(b[i] + " ");
//}
//}
//
//

public class k
{
 public static void main (String args[])
 {
        String abc = "abc";

        System.out.println ("Char at offset 0 : " + abc.charAt(0) );
        System.out.println ("Char at offset 1 : " + abc.charAt(1) );
        System.out.println ("Char at offset 2 : " + abc.charAt(2) );

	// This line should throw a StringIndexOutOfBoundsException
        System.out.println ("Char at offset 3 : " + abc.charAt(3) );
 }
}