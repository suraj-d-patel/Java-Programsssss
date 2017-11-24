///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Suraj
// */
//public class e {
//    public static void main(String[] args) {
//        int a=2,b=8;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a= "+a);
//        System.out.println("b= "+b);
//    }
//            
//}


    public class e
{//                       ExtraElement
    public static void main(String[] args) 
    {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,1,4,5,2,6,9};
        int extra = 0;
        for(int i=0;i<Math.max(arr1.length,arr2.length);i++)
        {
            if(i<arr1.length)
                extra = extra^arr1[i];
            if(i<arr2.length)
                extra = extra ^ arr2[i];
        }
        System.out.println("Extra Element is : "+extra);
    }
}

