import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n =0;
        n= scanner.nextInt();
        int[]arr = new int[n];
        int aux=0;
        for(int i = 0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        for(int i =0; i<n ; i++){
            for(int j=0; j<n;j++){
                if(i!=j){
                    if(aux<arr[i]*arr[j]){
                        aux=arr[i]*arr[j];
                    }
                }
            }
        }
        System.out.println(aux);
    }
}