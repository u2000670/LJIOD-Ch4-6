package ljiod_ch10;
import java.io.*;

public class BufferedReader_2 {

    public static void main(String[] args) {
        
        String line;
        //no need to close BUfferedReader object if it's in try
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\T_T\\Documents\\NetBeansProjects\\LJIOD_Ch10\\src\\ljiod_ch10\\myFile.txt")))
        {
            
            line = reader.readLine();
            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }
    
}

