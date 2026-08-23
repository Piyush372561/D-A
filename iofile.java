import java.io.*;

public class iofile {
    public static void main(String[] args) throws Exception{
        System.out.println("Input Stream program.");
        
        /* FileInputStream fin = new FileInputStream("example.txt");
        int a1 = fin.read();
        int a2 = fin.read();
        int a3 = fin.read();
        fin.skip(3);
        byte[] b = new byte[3];
        fin.read(b);
        int a4 = fin.available();
        fin.close();
        */
        FileOutputStream fout = new FileOutputStream("example.txt");
        fout.write(65);
        fout.write(66);
        fout.write(67);
        byte[] b = {68,69,70,71,72,73,75,76,77,78};
        fout.write(b);
        fout.write(b,2,4);
        fout.close();

    }

}