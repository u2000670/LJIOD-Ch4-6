package ljiod_ch10;
import java.io.*;

public class bufferbuffer {
    
    public static void main(String[] args) {
        
        String text = "\n\nThe ten-dollar Founding Father without a father \nGot a lot farther by working a lot harder \nBy being a lot smarter \nBy being a self-starter \nBy fourteen, they placed him in charge of a trading charter";
        
        //file doesn't exist -> creates one and writes it there
        //file DOES exist -> appends (adds where cursor previously ended) to the exisiting file 
        try(BufferedWriter w = new BufferedWriter(new FileWriter ("myFile.txt", true))){
           
           w.write(text);
           w.newLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //2nd arg = false || completely omitted -> overwrites it
        try(BufferedWriter w = new BufferedWriter(new FileWriter ("myFile.txt"))){
           
            w.write(text);
            w.newLine();
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }


        
    }
}
