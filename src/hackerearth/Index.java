package hackerearth;

import java.util.Scanner;

public class Index {
    public static void main(String args[] ) throws Exception {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int x =  s.nextInt();
    int a[] = new int[N];
    int store=-1;

        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
            if(a[i]==x)
                store=i+1;
        }
        
 System.out.println(""+store);
        
    }
   
}
   
