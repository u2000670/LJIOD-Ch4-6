package ljodliw;
import java.util.Scanner;

public class LJODLIW_Ch5 {
    public static void main(String[] args) {
        
        //5.1 Displaying output
        
        // w/o (), 17 & 2 are concatenated, not added
        System.out.println("The Queen is  "+ 17 + 2 +" years old");
        System.out.println("I am "+ (17 + 2) +" years old");
        
        //5.2 Escape Sequences
        System.out.println("\\0o0/");
        System.out.println("I'm a \"Muslim\"");
        
        //5.3 Formatting Outputs
        System.out.printf("%,d%n" ,54321);  //thousands seperator flag(,)
        System.out.printf("%,d%n" ,87654321);   //%n = newline
        
        //5.4 Input
        Scanner s = new Scanner(System.in);
        System.out.print("\nHow many cats dyou have?: ");
        int cats = s.nextInt();
        s.nextLine();   //to remove enter key after s.nextInt()
        System.out.print("Name one of them: ");
        String catName = s.nextLine();
        System.out.println(catName + ", a fine name that is!");
        
    }
}
