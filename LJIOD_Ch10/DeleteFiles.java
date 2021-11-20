package ljiod_ch10;
import java.io.*;

public class DeleteFiles {
    public static void main(String[] args) {
        File f = new File("myFile.txt");
        File nf = new File("myNewFile.txt");

        //oldFileName.renameTo(newFileName) - return "true" if it's successful, otherwise it returns "false"
        boolean b = f.renameTo(nf);
        System.out.println(b);

        nf.delete();
    }
    
}
