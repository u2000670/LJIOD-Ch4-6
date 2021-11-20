package ljiod_ch10;
import java.io.*;

public class LJIOD_Ch10 {

    public static void main(String[] args) {
        BufferedReader reader = null;
        String line;
        
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\T_T\\Documents\\NetBeansProjects\\LJIOD_Ch10\\src\\ljiod_ch10\\myFile.txt"));
            line = reader.readLine();
            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                //closing the BufferedReader object
                if(reader!=null)
                reader.close();
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}

