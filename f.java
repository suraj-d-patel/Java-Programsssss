public class f
//                           ArrangeZeroOne
{
    public static void main(String[] args)
    {
        int arr[]={1,1,1,1,0,1,0};
        int zero=0,one=0;
        for(int i=0;i<arr.length;)
        {
            for(int o=one;o<arr.length;o++)
            {
                if(arr[o]==1)
                {
                    one = o+1;
                    System.out.print(arr[o]);
                    i++;
                    break;
                } 
            }
            for(int z=zero;z<arr.length;z++)
            {
                if(arr[z]==0)
                {
                    zero=z+1;
                    System.out.print(arr[z]);
                    i++;
                    break;
                }
            }
        }
    }
}
