import java.io.*;

public class BUFFER {
    public static void main(String[] args) throws IOException{
        File file = new File("file2.txt");
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("bkbnldkblkbnlbkgdnblkgbnlbkgnglkn;slk");
        bw.write("bkbnldkblkbnlbkgdnblkgbnlbkgnglkn;slk");
        bw.write("bkbnldkblkbnlbkgdnblkgbnlbkgnglkn;slk");
        bw.close();
    }
}
