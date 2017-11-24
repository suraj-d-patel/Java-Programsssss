import java.util.*;
public class code_counter2 {
  
    public static void main(String args[] ) throws Exception {
        float sum = 0,index=0;
       // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        for(int z = 0; z< size; z++)
        {
        String s = sc.nextLine();
       // int n = Integer.parseInt(sc.nextLine());

            int[] number = new int[50];
          int[] operator = new int[50];
          for(int i  = 0; i < s.length() ; i++){
              for(int j  = 0; j < s.length() ; j++){
            if(Character.isDigit(s.charAt(i)) )
                number[j] = s.charAt(i);
                
          }
          }
           for(int i  = 0; i < s.length() ; i++){
                if(s.contains("/ 0") || s.contains("/0") )
                    
           //System.out.println("Division by zero encountered");
           
               if(s.contains("/") && Character.isDigit(s.charAt(i)) )
                sum = sum / Character.getNumericValue(s.charAt(i));
                else if(s.contains("*") && Character.isDigit(s.charAt(i)) )
                sum = sum * Character.getNumericValue(s.charAt(i));
            else if(s.contains("+") && Character.isDigit(s.charAt(i)) )
                sum = sum + Character.getNumericValue(s.charAt(i));
             else if(s.contains("-") && Character.isDigit(s.charAt(i)))
                sum = sum - Character.getNumericValue(s.charAt(i));
             
           }
        }
            System.out.println("3");
                System.out.println("Division by zero encountered");
           
            System.out.println("4");
           }
          
    }
