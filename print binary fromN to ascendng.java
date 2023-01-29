import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
       // int i=0;
        String binaryString="1";
        while(n-- > 1)
        {
            binaryString=binaryString + "0";
        }
        System.out.println(binaryString);
        int decimal=Integer.parseInt(binaryString,2);
        while(true){
            decimal++;
            binaryString=Integer.toBinaryString(decimal);
            if(binaryString.length()>m){
                break;
            }
            System.out.println(binaryString);
        }
        //String str1 = Integer.toString();
        //int decimal=Integer.parseInt(Integer.toString(),2);
          //  System.out.println(Integer.toBinaryString(decimal));

    }
}
