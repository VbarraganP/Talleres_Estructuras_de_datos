import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.util.concurrent.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n =0;
        n= scanner.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]=scanner.nextInt();
        }
        int contador=0;
        int aux=0;
        
        for(int i =0;i<n;i++){
            
            for(int j=0;j<n;j++){
                if(i=j && i+j<0)contador++;
                if();
            }
            
        }
        System.out.println(contador);
    }
}