/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */
public class b {
    public static void main(String[] args) {
        int[] array = {22,2,1,5,4,8,45,6,55};
        int length= array.length;
        for (int i = 0; i < 10; i++) {
            sort(array,length);
                 
                
        }
    }
    static void sort(int[] array,int c)
    { int temp;
        for (int j = 0; j < c-1; j++) {
             if(array[j]>array[j+1])
             {
                 temp= array[j];
                 array[j]=array[j+1];
                 array[j+1]=temp;
             }
        }
        for (int f : array) {
            System.out.println(array[f]);
        }
    }
}
