import java.util.*;
import java.io.*;
public class bufferReader {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("C:\\tset.txt");  //your file location
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
