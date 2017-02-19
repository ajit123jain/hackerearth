package hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Binarysort {
    public static int a[];
    public static int N;
public static void main(String args[]){
  Scanner s = new Scanner(System.in);
        N = s.nextInt();
         a = new int[N];
         
        for (int i = 0; i < N; i++) {
           a[i]=s.nextInt();
        
          } 
        MergeSort ob = new MergeSort();
        ob.sort(a, 0, a.length-1);        
           

        
       
        int x =s.nextInt();
  for(int i=0; i<x; i++){
      binarySearch(s.nextInt());
        
        }
}
public  static void  binarySearch(int key) 
    {    
         int low = 0;
         int high = N - 1;
         
         while(high >= low) {
            // System.out.println("high = "+high+" low "+low);
             int middle = (low + high) / 2;
             if(a[middle] == key) {
                 System.out.println(""+(middle+1));
                 break;
             }
             if(a[middle] < key) {
                 low = middle + 1 ;
             }
             if(a[middle] > key) {
                 high = middle - 1;
             }
        }
       
        
   }
 
}

