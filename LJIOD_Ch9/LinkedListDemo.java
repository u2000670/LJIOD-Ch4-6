package ljiod_ch9;
import java.util.ArrayList;
import java.util.LinkedList;



public class LinkedListDemo {
    public static void main(String[] args) {
        
        //LinkedList Methods (all ArrayList methods above^ can be used with LinkedList)
        LinkedList<Integer> myNumList = new LinkedList<>();
        
        myNumList.add(90);
        myNumList.add(9);
        myNumList.add(81);
        myNumList.add(18);
        myNumList.add(72);
        
        //poll() - returns the 1st element & removes it from the list
        // return "null" if list is empty
        int removedElement = myNumList.poll();
        System.out.println("Removed The 1st Element : "+removedElement);
        System.out.println("LinkedList: "+myNumList);
        
        //peek() -returns 1st element BUT DOES NOT remove it - returns "null" if list is empty
        int peek = myNumList.peek();
        System.out.println("LinkedList after peeking: "+myNumList);
        
        //getFirst() = peek BUT gives NoSuchElementException when list is empty
//        myNumList.clear();
//        int first = myNumList.getFirst();
        
        //getlast() = getFirst() BUT returns the last element but doesn't remove it
        
    }
}
