package hackerearth;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
        }
        
    int temp,count=0;
    for(int i=0; i < N; i++){  
                 for(int j=1; j < (N-i); j++){  
                          if(a[j-1] > a[j]){  
                                
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                                 count++;
                         }  
                          
                 }  
         }  
System.out.println(""+count);
}
}