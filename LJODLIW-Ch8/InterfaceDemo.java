package interfacedemo;

public class InterfaceDemo {

    public static void main(String[] args) {
        myClass a = new myClass();
        a.someMethod();
        a.someDefaultMethod();
        
        myInterface.someStaticMethod();
        System.out.println("THe value of the constant is "+myInterface.myInt);
    }
    
}   
    //class that implements interface must implements all abstract methods
    class myClass implements myInterface{
        @Override
        public void someMethod(){
            System.out.println("This is a method implemented in myClass");
        }
    }
    interface myInterface {
        int myInt = 5;
        void someMethod();
        public static void someStaticMethod(){
            System.out.println("static method inside interface");
        }
        public default void someDefaultMethod(){
            System.out.println("default method inside interface");
        }
        
    }