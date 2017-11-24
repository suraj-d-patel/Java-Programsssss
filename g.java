/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */
import java.io.*;
public class g {

    public static void main(String[] args) throws IOException {
        int matrix[][] = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22, 23, 24}};
        int i = 0, j = 4;
        int input=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==input)
                {
                    System.out.println("Number found at "+ i+"and"+ j);
                }
//                else
//                {
//                    System.out.println("Number not found");
//                }
            }
        }
         System.out.println("Number not found");
    }
}
