public class d {
        static int linear_search(int array[],int key)
        {
            for(int i =0;i <array.length;i++)
            {
                if(array[i] == key)
                {
                       return i;
                 }}
                     return -1;
            }
        
    
    
    
    public static void main(String[] args) {
   int array[] = {1,2,4,5,78,98,5,32,654,56,54,89,865,5,465,49798,59+6,};
    int key = 65;
   int position = linear_search(array,key);
        if (position==-1)
        {
            System.out.println("length of array = "+array.length);
            System.out.println("Element not found");
            
        }
        else{
            System.out.println("length of array = "+array.length);
                System.out.println("Element found at position" + (position+1));
        }
    }
}
