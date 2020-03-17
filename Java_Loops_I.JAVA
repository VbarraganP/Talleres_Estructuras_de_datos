import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i =1;i<=10;i++) multiplicador(N,i);
        scanner.close();
    }
    public static void multiplicador (int N, int i){
        System.out.println(N+" x "+i+" = "+N*i);
    }
}
