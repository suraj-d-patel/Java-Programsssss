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

    public static void main(String[] args) {
        System.out.println("hello world");
        String s = "  hello bro. How are you right now....";
        int n = s.length();
        System.out.println(s.substring(2, n));
        StringBuffer sb = new StringBuffer(s);
        sb.append("I am appending the previous String.");
        System.out.println(sb); 
        StringBuffer sb1 = new StringBuffer(sb);
        sb1.insert(10,"#######%@@@@@@@@@@@@JNjkn");
        System.out.println("After insertion" +sb1);
        sb1.delete(10, 15);
        System.out.println("After deletion" +sb1);
        sb1.setCharAt(10,'!');
        System.out.println("After setCharAt" +sb1);
        sb1.reverse();
        System.out.println("After reversing" +sb1);
        
       
    }
}
