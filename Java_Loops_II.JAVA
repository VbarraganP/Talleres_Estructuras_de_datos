import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultado=a;
            for (int j=0;j<n;j++){
                int pote = (int) Math.pow(2, j);
                resultado=(resultado+(pote*b));
                System.out.print(resultado+" ");
            }  
            System.out.println();
        }
        in.close();
    }
}