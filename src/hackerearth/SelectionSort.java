package hackerearth;

import java.util.Scanner;

public class SelectionSort {
public static void  main(String args[]){
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         int a[] = new int[n];
        for (int i = 0; i < n; i++) {
           a[i] = s.nextInt();
        }
    int x = s.nextInt();
    for (int i = 0; i < x; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }
    for (int i = 0; i < n; i++) {
          System.out.print(""+a[i]);
          System.out.print(" ");
        }
}
}