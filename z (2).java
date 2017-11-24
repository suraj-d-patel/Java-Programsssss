
/*public class z {
    public static void main(String[] args) {
        for(int r=5; r>=1;r-- )
        {
           for(int k=5; k>=r;k--)
           {
               System.out.println(" 5");
           }
            for(int c=1; c<=r;r++)
             {
                 System.out.println(c);
             }
             System.out.println("");
        }
    }
}*/
// revers the string
public class z {
    public static void main(String[] args) {
        String str = "My name is Suraj .";
        String a[] = str.split(" ");
        for (String result : a)
            System.out.print(result +" ");
        System.out.println("");
        for ( int i= a.length-1; i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}

