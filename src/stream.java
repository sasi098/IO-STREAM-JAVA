import java.io.*;
import java.util.*;

public class stream {
    public static void main(String[] args) throws IOException{
        File file = new File("file1.txt");//creating a file
        FileWriter write = new FileWriter(file);//creating a write object for file1.txt // appending can be done by adding true to this
        write.write("he this is first file in this io streams");//writing text into a file
        write.close();//closing writer

        FileReader fr = new FileReader("file1.txt");
        int x; // file reader will return x after reading character in the file
        while((x = fr.read()) != -1){//it stops after reaching -1 in the text or means last character after nothing
            System.out.print((char)x);
        }
        System.out.println();
        fr.close();


        //READING SAME FILE AND WRITING IN ANOTHER FILE
        FileReader fr2 = new FileReader("src/stream.java");//got to src and then get stream.java
        FileWriter fw = new FileWriter("file1.txt");
        int x2;
        while((x2 = fr2.read()) != -1){
            fw.write((char)x2);
        }

        fr2.close();
        fw.close();
    }
}
