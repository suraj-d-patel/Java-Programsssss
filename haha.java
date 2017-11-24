//TREE = 0; WATER = 1;
import java.io.IOException;

import java.util.Scanner;

 public class haha {
     int COUNTER=0;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int row,col,x,y;
        
        row=sc.nextInt();
        col=sc.nextInt();
        String [][] array = new String[row][col];
        
        for(int i=0;i<row;i++)
        {   
           for(int j=0;j<col;j++)
           {
               array[i][j] =sc.next();
           }
        }
        
        
        
        
        
        System.out.println("enter co-ord of tree that catches fire");
            int xc=0,yc=0;
        for(int vv = 0;vv<2;vv++)
               {
                   xc = sc.nextInt();
                   yc = sc.nextInt();
               }
         
    }
          
        

     void catches_fire(char x,char y)
    {        
        char t='t'; 
       if(x==t||y==t)
       {
           check_top(x,y);}
           else
           {
               System.out.println(-1);    
           }
       }
    
    
    
    
     void check_top(int x,int y)
    {
            
        if((y-1)== 0)
        {
            add(x,y-1);
        }
        else
            check_left(x,y);
    }
     void check_left(int x,int y)
    {
        if((x-1)== 0)
        {
            add(x-1,y);
        }
        else
            check_bottom(x,y);
    }
     void check_bottom(int x,int y)
    {
        if((y+1)== 0)
        {
            add(x,y+1);
        }
        else
            check_right(x,y);
    }
     void check_right(int x,int y)
    {
        if((x+1)== 0)
        {
            add(x+1,y);
        }
        else
            check_topleft(x,y);
    }
     void check_topleft(int x,int y)
    {   x=x-1;
        if((y-1)== 0)
        {
            add(x-1,y-1);
        }
        else
            check_topright(x,y);
    }
         void check_topright(int x,int y)
        {
            x=x+1;
        if((y-1)== 0)
        {
            add(x+1,y-1);
        }
        else
            check_bottomleft(x,y);
        }
         void check_bottomleft(int x,int y)
        {
            x=x-1;
            
        if((y+1)== 0)
        {
            add(x-1,y+1);
        }
        else
            check_bottomright(x,y);
        }
         void check_bottomright(int x,int y)
        {
            x=x+1;
        if((y+1)== 0)
        {
            add(x+1,y+1);
        }
        else
            check_topright(x,y);
        }
        
        
            //add a= new add(x,y);
           /* int[][] arr = new int[4][4];
            for(int g= 0; g<4;g++)
            {
                for(int h= 0; h<4;h++)
                arr[g][h]= add[][];
            }
            arr[]
        add()*/
            int[] arr = new int[16];
            int add(int x,int y)
            {
                for(int g=0;g<16;g++)
                {
                arr[g]=add(x,y);
                
               }
                return COUNTER++;
       }
        
 }
        

        