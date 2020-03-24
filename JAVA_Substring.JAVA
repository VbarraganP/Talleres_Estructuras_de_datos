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
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            int arrItem = Integer.parseInt(arrItems[i]);
            
            arr[i]= arrItem;
        }
        
        
        for(int i =0;i<n;i++){
            
            System.out.println(arr[i]);
            
        }
    }
}