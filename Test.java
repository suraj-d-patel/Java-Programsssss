
import java.util.ArrayList;

public class Test {
        public static void main(String [] args) {
            int j = 2, y = 3, z = 10;
            for (;j < 6;j++) {
                y = (++y + z++);
                System.out.println(y);
                System.out.println(z);
                System.out.println(y+z);
            }
        }
    }
/*class Output {
        public static void main(String args[]) {
            ArrayList obj = new ArrayList();
            obj.add("A");
            obj.add("D");
            obj.ensureCapacity(3);
            obj.trimToSize();
            System.out.println(obj.size());
        }
}*/

/*
import java.util.*;
    class Arraylist {
        public static void main(String args[]) {
            ArrayList obj1 = new ArrayList();
            ArrayList obj2 = new ArrayList();
            obj1.add("A");
            obj1.add("B");
            obj2.add("A");
            obj2.add(1, "B");
            System.out.println(obj1.equals(obj2));
        }
    }*/

/*
  import java.util.*;
    class Output 
{
        public static void main(String args[])
        {
            Integer i=0;
            Integer j=0;
            for(Short z=0;z<5;z++)
            if((++i>3)|| (++j>3))
            i++;
            System.out.println(i);
        }
}
/*
class j{
public static void main(String args[])
    {
        char arrayStr[] = {'a', 'b', 'c', '\0'};
        String strStr = "abc";
        System.out.println( "Length of arrayStr " + arrayStr.length + " - Length of strStr " + strStr.length());

    }}*/
/*
class Demo{
        public static void main(String args[])
        {
            String c = "I am a programmer";
            int start = 2;
            int end = 9;
            char s[]=new char[end-start];
            c.getChars(start,end,s,0);
            System.out.println(s);
        }
    }*/
/*
class Demo{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello");
        s1.deleteCharAt(1);
        System.out.println(s1);
    }
}*/

/*
class Demo{
    public static void main(String args[])
    {
        char a[] = {'a', '5', 'A', ' '};
        System.out.print(Character.isDigit(a[0]) + " ");
        System.out.print(Character.isWhitespace(a[3]) + " ");
        System.out.print(Character.isUpperCase(a[2]));
    }
}
/*
 public class Test{
        public static void main(String args[]){
            double[] myList = {1, 4, 4, 4,1};
            double max = myList[0];
            int indexOfMax = 0;
            System.out.println(myList.length);
            for(int i = 1; i < myList.length; i++){
                if(myList[i] > max){
                    max = myList[i];
                    System.out.println(max);
                    indexOfMax = i;
                    System.out.println(indexOfMax);
                }
            }
            System.out.println(indexOfMax);
        }
    }*/