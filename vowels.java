import java.io.*;
class vowels {
     public static void main(String args[]) throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
int n;
System.out.println("Enter the characters");

n=Integer.parseInt(br.readLine());
n=(char)(br.readLine());
switch(n)
{
         case('A'):
         case('E'): 
         case('I'): 
         case('O'): 
         case('U'): 
         case('a'): 
         case('e'): 
         case('i'): 
         case('o'): 
         case('u'):
             System.out.println("It's a VOWEL bro");
             break;
         default:
             System.out.println("It's not a VOWEL...It's a Consonant");
}
 }
}
