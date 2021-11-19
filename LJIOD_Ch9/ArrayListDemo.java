package ljiod_ch9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        Integer N = 100;    //integer (100) -> Integer object, N
        int n1 = N.intValue();  //Integer object,N -> primitive integer ,n1
        int n2 = N*2;         // shortcut Integer object -> prim integer
        System.out.println("primitive int 1 = "+n1);
        System.out.println("int 1 * 2  = "+n2);
        
        //Converting Strings to primitive data types 
        //String -> int
        int n3 = Integer.parseInt("7");
        System.out.println(n3);
        
        System.out.println("\n--------------------------------------------------");
        //Lists are arrays but we can change the size
        ArrayList<Integer> userAgeList = new ArrayList<>();    //An ArrayList of Integer objects
        ArrayList<String> StringArrayList = new ArrayList<>();  ////An ArrayList of String objects
        
        //ArrayList Methods 
        //add() - Adds members to a list
        
        userAgeList.add(N);
        userAgeList.add(N/4);
        userAgeList.add(N/2);
        userAgeList.add(N/5);
        System.out.println(userAgeList);    //prints out userAgeList in [  ]
        
        //adding members in specific positions
        // ArrayListName.add( index, number to be added)
        userAgeList.add(2, N/3);    //initial number in index 2 and numbers after are shifted to the right
        System.out.println(userAgeList);
        
        //set() - replacing members
        userAgeList.set(0, 50);
        System.out.println(userAgeList);
        
        //remove() - removes members 
        userAgeList.remove(4);  //takes in index as arg
        System.out.println(userAgeList);
        
        //get() - returns a member
        int g = userAgeList.get(1);
        System.out.println("get() returns = " +g);
        
        //size() - to know how many elements there are in a list
        int size = userAgeList.size();
        System.out.println("size() gives "+size);
        
        //contains() - to find a specific element in a list
        boolean check = userAgeList.contains(33);
        System.out.println("33 is in the list: "+check);
        
        //indexOf() - gives the index of the number when it first occurs in the list
        int index1 = userAgeList.indexOf(50);
        System.out.println("50 first occurs at index "+index1);
        //if number is not in list, indexOf() returns -1 
        int index2 = userAgeList.indexOf(54);
        System.out.println("54 first occurs at index "+index2);
        
        //toArray() - turning the ArrayList to an array
        //Object class is the parent class of all classes in Java
        Object[] myArray = userAgeList.toArray();   
        System.out.println(Arrays.toString(myArray));
        
        //clear() is to wipe out all elements in the list
        //Using Lists in Methods

    }
}
