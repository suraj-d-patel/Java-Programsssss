/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */

import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        System.out.println("start");
        int counter=0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chararray= input.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            for (int j = chararray.length; j < 0; j++) {
                if(chararray[i]==chararray[j])
                {
                    for (int k = 0; k < 10; k++) {
                       if(chararray[i++]==chararray[j--]);
                       counter++;
                    }
                }
            }
            
        }
        System.out.println("longest palindrome = "+ counter);
    }
}
