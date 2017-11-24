//
//class LargestSum {
//
//    public static void main(String[] args) {
//        int a = 2, b = 8;
//        System.out.println("a is equal to " + a);
//        System.out.println("b is equal to " + b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a is equal to " + a);
//        System.out.println("b is equal to " + b);
//    }
//
//}
//import java.util.*;
//class j{
//    public static void main(String[] args) {
//        int i,t;
//        int[] x = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array");
//          for( i=0;i<10;i++)
//          { x[i] = sc.nextInt();}
//            for(i=0;i<5;i++)
//             {
//               t=x[i];
//               x[i]=x[9-i];
//               x[9-i]=t;
//             }
//        System.out.println("REVERSE ARRAY");
//                for( i= 0;i<10;i++)
//                System.out.println(x[i]);
//    
//    
//}
//    }
import java.util.*;
    class j {
        public static void main(String[] args) {
            System.out.println("Input Matrix");
            Scanner sc =  new Scanner(System.in);
            int t;
           int n= sc.nextInt();
           int m= sc.nextInt();
            int[][] array = new int[n][m];
            System.out.println("Size of "+ n +"*" + m);
            for(int i=0;i<n;i++)
            {
                for(int j = 0;j<m;j++)
                array[i][j] = sc.nextInt();
            }
//            for(int i=0;i<n;i++)
//            {
//                for(int j = 0;j<m;j++)
//                {
//                    if(i<j)
//                    {
//                        t=array[i][j];
//                        array[i][j] = array[j][i];
//                        array[j][i] = t;
//                    }
//                }
//            }
//            
            for(int i=0;i<n;i++)
            {
                for(int j = 0;j<m;j++)
                    System.out.print(array[i][j]);
                System.out.println("");
            }
        }
    }
