
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */
public class a {
              public static final void main(String[] args) {
                  System.out.println("hello");
                  Scanner sc = new Scanner(System.in);
                  String input = sc.nextLine();
                 // String sout=input.replaceAll(input,"");
                  System.out.println(input.replaceAll("[AEIOUaeiou]",""));
    }
}
