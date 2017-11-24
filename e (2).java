//
//
//public class e
//{
//    public static void main(String[] args)
//    {
//        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
// 
//        System.out.println(i);
//    }
//}

//
//
//import java.io.*;
//import java.util.*;
//public class e {
//   public static void main(String args[] ) throws Exception {
//
//	Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number");
//    int a = sc.nextInt();
//    for(int c=0;c<a;c++)
//    {
//      for (int b =1;b<5;b++)
//      {
//          System.out.print("*");
//      }
//        System.out.println("*");
//        System.out.println();
//       
//    }
//       
//   }
//}

//public class e
//{
//    public static void main(String[] args) {
//        StringBuffer sbf = new StringBuffer("Hello sir this is suraj");
//        System.out.println(sbf.reverse());
//    }
//}

//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class e {
//    
//    private static String getLargest(String param) {
//        String result = "";
//        int indexofLess = -1;
//        for(int i=param.length()-1;i>0;i--) {
//            if(param.charAt(i)<param.charAt(i-1))
//                indexofLess = i - 1;
//            if(i==indexofLess&&param.charAt(i)==param.charAt(i-1))
//                indexofLess = i - 1;
//            char c = param.charAt(i);
//            result = c + result;
//        }
//        result = param.charAt(0) + result;
//        if(indexofLess==-1) return result;
//        char degrade = (char)(param.charAt(indexofLess) - 1);
//        result = result.substring(0, indexofLess) + degrade;
//        for(int i=indexofLess+1;i<param.length();i++)
//            result += '9';
//        return result;
//    }
//    
//	public static void main (String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int numbers = Integer.parseInt(scan.nextLine());
//		for(int i=0;i<numbers;i++) {
//		    String dummy = scan.nextLine();
//		    System.out.println(getLargest(dummy));
//		}
//	}
//}
//
//public class e {
//    public static void main(String[] args)
//     {
//         // the line below this gives an output
//         // \u000d /*System.out.println("comment executed");*/
//     }
//}

//public class e 
//{
//    public static void main(String[] args)
//    {
//    loop1:
//    for (int i = 0; i < 5; i++)
//     {
//        for (int j = 0; j < 5; j++) 
//        {
//            if (i == 3)
//                break loop1;
//            System.out.println("i = " + i + " j = " + j);
//        }
//    }
//   }
//}

import java.util.Scanner; 
class e{
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        int testCases = scanner.nextInt();
 
        int t,n,i,a,zero,one,negone,other;
 
        while (testCases-- > 0) {
            one=zero=negone=other=0;
 
            int num = scanner.nextInt();
 
 
            while (num-- > 0) {
                a = scanner.nextInt();
                if(a==1)
                    one++;
                else if(a==0)
                    zero++;
                else if(a==(-1))
                    negone++;
                else
                    other++;
            }
            if(other>1)
                System.out.println("no");
            else
            {
                if(negone>0 && other>0)
                    System.out.println("no");
                else if((one==0)&&(negone>1))
                    System.out.println("no");
                else
                    System.out.println("yes");
            }
 
        }
    }
}

