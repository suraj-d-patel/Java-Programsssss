
public class e {
        public static int Insertion(int array[],int capacity,int n, int key)
                    {
                        if(n>=capacity)
                            return n;
                        array[n]=key;
                       return n+1;    
                        
                    }
    
    public static void main(String[] args) {
            //InputStreamReader isr = new InputStreamReader(System.in);
            //BufferedReader br = new BufferedReader(isr);
                    //Scanner scanner = new Scanner();
                     
                    int[] array = new int[20];
        array[0]=1;
        array[1]=12;
        array[2]=151;
        array[3]=154;
        array[4]=551;
        array[5]=7781;
        array[6]=321;
        array[7]=145;
        int capacity=20 ;
        int key = 266;
        int n=8;//int key = br.readInt();
           /*    for(int a : array){
        System.out.println("Before Insertion -> "+ a);}
        Insertion(array,capacity,n,key);
        for(int b : array)
        System.out.println("After Insertion -> " + b);*/
           System.out.println("Before Insertion");
           for(int j=0;j<n;j++)
           {System.out.print(array[j]+" ");}
           
           
          n= Insertion(array,capacity,n,key);
           
           
           System.out.println("\n After Insertion");
           for(int k=0;k<n;k++)
           {System.out.print(array[k]+" ");}
           
    }
    
    }
    

