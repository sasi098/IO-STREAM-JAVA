import java.io.*;

public class BUFFER {
    public static void main(String[] args) throws IOException{
        File file = new File("file2.txt");
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("bkbnldkblkbnlbkgdnblkgbnlbkgnglkn;slk\n");
        bw.write("bkbnlMdkblkbnlbkgdnblkgbnlbkgnglkn;slk\n");
        bw.write("bkbnldkblkbnlbkgdnblkgbnlbkgnglkn;slk\n");
        bw.close();

        //buffer reader
        BufferedReader br = new BufferedReader((new FileReader("file2.txt")));//IN ONE LINE // WRAPPING ANONYMUS OBJECT
//        int x;
//        while((x = br.read()) != -1){
//            System.out.print((char) x);
//        }

        String line;//TPGET LINES NOT BY CHARACTER BY CHARACTER
        while((line = br.readLine()) != null){
            System.out.println(line);
        }


        br.close();
    }
}
