package ljodliw.LJODLIW_Ch7;

class myClass{
    //non-static field & method
    public String message = "ayye";
    public void displayMessage(){
        System.out.println("Message = "+ message);
    }
    //static field & method
    public static String greeting = "adieu";
    public static void displayGreeting(){
        System.out.println("Greeting = " + greeting);
    }
}

public class staticDemoCh7 {
    public static void main(String[] args) {
        //non-static - object needs to be created to use fields & methods
        myClass c = new myClass();
        System.out.println(c.message+" whacha doin here?");
        c.displayMessage();
        
        //static - uses the class name to access static fields & methods
        System.out.println("\nI bid to ye, "+myClass.greeting);
        myClass.displayGreeting();
    }
}
