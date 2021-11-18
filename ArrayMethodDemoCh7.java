package ljodliw.LJODLIW_Ch7;
import java.util.Arrays;

public class ArrayMethodDemoCh7 {
    public static void main(String[] args) {
        
        arrayClass c = new arrayClass();
        int[] array = {3,4,5};
        
        c.print1stEelement(array);
        
        int [] array2 = c.returnArray();
        System.out.println(Arrays.toString(array2));
        
        System.out.println("\n--------------------");
        
        int num = 12;
        System.out.println("Number before = "+num);
        System.out.println("in the prim method: "+c.primitiveMethod(num));;
        System.out.println("Number after = "+num);
        
        System.out.println("\nArray before = "+array[1]);
        System.out.println("in the ref method: "+c.referenceMethod(array));;
        System.out.println("Array after = "+array[1]);
        
        
    }
}

class arrayClass {
    public void print1stEelement(int[] a){
        System.out.println("1st element of array = "+a[0]);
    }
    public int [] returnArray(){
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
             a[i] = i*2;
        }
        return a;
    }
    
    public int primitiveMethod(int prim){
        prim++;
        return prim;
    }
    
    public int referenceMethod(int [] ref){
        ref[1]++;
        return ref[1];
    }
    
}   
