import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner entrada = new Scanner(System.in);
        int i=1;
        while(entrada.hasNextLine()){
            String Line = entrada.nextLine();
            System.out.println(i+" "+Line);
            i++;
        }
        entrada.close();
    }
}