package ljodliw_ch4;
import java.util.Arrays;    //import this class to use Array methods

public class LJODLIW_Ch4 {

    public static void main(String[] args) {
        //4.1 Common String Methods
        
        String verse = "Kami rela mejaga namamu";
        String snippet = verse.substring(0,9);  //substring() / 0 start, 9 stops
        System.out.println(snippet);
        
        //charAt() - gives character at the given index
        char capitalK = verse.charAt(0);    
        System.out.println(capitalK);
        
        
        //4.2 Arrays
        
        int[] age1;  //array declaration
        age1 = new int[] {18, 19, 20, 21, 22};   //array initialization
        int [] age2 = {91, 81, 71, 61, 51};     //2 in 1 dec & init (no new)
        int [] age3  = new int[3];      //3rd way to dec & init array
        // age3 = {0, 0, 0} / 0 used as default value if elements aren't assigned
        
        //printing array with Arrays.toString()
        System.out.println(Arrays.toString(age3));  
        
        //copyOfRange() -copy parts of an array & pasting it to another
        int[] copy = Arrays.copyOfRange(age1, 0, 2);    
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(age1));  //original array is unaffected from copy
        
        //sort() sorts age2 array in ascending order -modified it
        Arrays.sort(age2);  
        System.out.println(Arrays.toString(age2));
        
        //binarySearch() finds number 81 in array age2 and returns the index /if index -ve, then num not found
        int foundIndex = Arrays.binarySearch(age2, 81);
        System.out.println(foundIndex);
        
        //length field (no parantheses) - gives how many items are in the array
        System.out.println(age2.length);
        
        
        
        
        
        
        
        
    }
    
}
