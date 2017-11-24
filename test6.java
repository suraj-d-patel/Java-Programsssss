import java.util.*;
public class test6
{  
public static void main(String[] args) 
{  
            int num[] = {212,122,15,582,1155,1,21,216,85,55,58};    
             String words[] = {"JAVA","Android","PHP",".net","hello","ASHU","C#","C Programming","C++"}; 
             System.out.println("Original Numeric Array was :" + Arrays.toString(num));
             Arrays.sort(num);
             System.out.println("Sorted Numeric Array is :" + Arrays.toString(num));
             System.out.println("Original String Array was :" + Arrays.toString(words));
             Arrays.sort(words);
             System.out.println("Sorted String Array is :" + Arrays.toString(words));
}  
}