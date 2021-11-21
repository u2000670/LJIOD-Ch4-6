package ljiod_ch11;



public class LJIOD_Ch11 {
    public static void main(String[] args) {
        //Restricting to only <Integer> objects
        MyGenericsClass <Integer> g= new MyGenericsClass();
        MyGenericsClass2  g2 = new MyGenericsClass2();
        
        g.setMyVar(626);
        g.printValue();    
        
        g2.setMyVar(6.4);
        g2.printValue();
        
        g2.setMyVar(6);
        g2.printValue();
    }
}
//<T> could accept any data type (Integer, Double, String etc)
 class MyGenericsClass <T>{
        private T myVar;
        void setMyVar (T i){
            myVar = i;
        }
        
        void printValue(){
            System.out.println("The value of myVar is "+myVar);
        }
    }

// <T extends A> where T is a subtype of A
//Integers & Doubles are under the Number class
 class MyGenericsClass2 <T extends Number>{
        private T myVar;
        void setMyVar (T i){
            myVar = i;
        }
        
        void printValue(){
            System.out.println("The value of myVar is "+myVar);
        }
    }