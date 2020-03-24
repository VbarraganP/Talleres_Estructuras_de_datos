import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n = A.length()/2;
        boolean control=true;
        for(int i=0 ; i<n ; i++ ){

            if(A.charAt(i)!=A.charAt((A.length()-1)-i)){
                control = false;
                break;
            }
        }
        if(control==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}