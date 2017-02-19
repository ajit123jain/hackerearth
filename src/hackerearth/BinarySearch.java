package hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[] ) throws Exception {
    Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a[] = new int[N];
        ArrayList<Integer> Array = new ArrayList<Integer>();
        
        

        for (int i = 0; i < N; i++) {
           Array.add(s.nextInt());
          }
       Collections.sort(Array);
       
         int x= s.nextInt();
         for(int i=0; i<x; i++){
       int p = Array.indexOf(s.nextInt());
        System.out.println(""+(p+1));
    }

       
    }
}    

