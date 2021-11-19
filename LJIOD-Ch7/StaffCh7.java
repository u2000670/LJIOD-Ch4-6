package ljodliw.LJODLIW_Ch7;

public class StaffCh7 {
    
    private String nameOfStaff;         // fields of class Staff
    private final int hourlyRate = 30;  //final = constant/ can't be modified after initialising
    private int hoursWorked;            //private = only accessible in Staff class
                                        // public = can be used by other classes
    public StaffCh7(String name){
        nameOfStaff = name;
        System.out.println("\n"+nameOfStaff);
        System.out.println("------------------------");
    }
    
    public StaffCh7(String firstName, String lastName){
        nameOfStaff = firstName+ " " +lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("------------------------");
        
    }
    
    public void printMessage(){
        System.out.println("Calculating Pay . . .");
    }
    
    public int calculatePay(){
        printMessage();
        
        // methods inside Staff class can access Staff fields (hoursWorked, hourlyRate)
        //local varaible staffPay only exists in calculatePay() method
        int staffPay = hoursWorked * hourlyRate;
        
        if (hoursWorked > 0)
                return staffPay;
        else return -1;
    }
    //overloading = same method name but has diff. signature (diff. method name || parameter)
    public int calculatePay(int bonus, int allowance){
        
        //calculatePay() & printMessage() are both members of the same class (Staff class)
        // Hence, no dot operator is needed (e.g. staff1.calculatePay() )
        printMessage();
        if (hoursWorked >0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else return 0;
    }
    
    //"set" in front is convention to show it's a  setter method 
    public void setHoursWorked(int hours){
        
        //setting limit for access to private field "horusWorked"
        if (hours > 0) 
                hoursWorked = hours;
        else    
            System.out.println("Error: HoursWorked cannot be smaller than or equal to 0");
    
    }
    public int getHoursWorked(){
            return hoursWorked;
    }
}
