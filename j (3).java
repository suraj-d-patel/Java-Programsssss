
public class j {
    public static void main(String[] args) {
        int flag=0;int n=173;
        for(int i=2; i<n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("is not a prime");
                flag =1;
                break;
            }
         }
        if(flag==0)
        System.out.println("is a prime");
    }
}
