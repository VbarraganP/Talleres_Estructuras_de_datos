import java.util.Scanner;
import java.util.Formatter;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                funcion(s1,x);
                
            }
            System.out.println("================================");
    }
    public static void funcion (String s1,int x){
        Formatter fmt = new Formatter();
        s1 = String.format("%-15s", s1);//formatea el texto a la izq  
        fmt.format("%03d",x);
        System.out.println(s1+fmt);
    }
}