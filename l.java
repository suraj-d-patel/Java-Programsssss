
public class l {
    public static void main(String[] args) {
      //  int array[]={1,2,3,4,5,6,7,8};
      int c=0;
        int[] array = new int[8];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        for(int i= 0;i<2;i++){
            c = array[i];
            System.out.println(array);
            System.out.println(c);}
        for(int j= 7;j>5;j--)
        { array[j]= c;
            System.out.println(array[i]);
        }
    }
}
