public class f {
        public static int search(int array[],int low,int high,int key)
        {
          
            if(high<low)
                return -1;
            int mid = ((low+high)/2);  
            if(key== array[mid])
             return mid;
            else if(key < array[mid])
               return search(array,low,mid-1,key);
                else 
               return search(array,mid+1,high,key);
        }
    
        public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,50,85};
        int key= 85;
        int n = array.length;
        System.out.println("Element found at " + search(array,0,n,key));
}
    
}
