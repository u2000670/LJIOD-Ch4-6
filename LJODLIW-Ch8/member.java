package inheritancedemo;
import java.util.Scanner;

abstract public class member {
        
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;     //protected - protected lineage (accessible only to this class, derived classes || classes of the same package
    private String name;
    private int memberID;
    private int memberSince;
    private int discount; 
    
    //constructor
    public member(){
        System.out.println("Parent Constructor with no parameter");
    }
    //constructor
    public member(String pName, int pMemberID, int pMemberSince){
        System.out.println("Parent Constructor with 3 parameters");
        
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
        
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(){
        Scanner s = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password = s.nextLine();
        if (!password.equals("yeet")){
            System.out.println("Invalid password. Youd o not have authority to edit the discount >:)");
        }else {
            System.out.print("Please enter the discount: ");
            discount = s.nextInt();
        }
    }
    
    public void displayMemInfo(){
        System.out.println("Member name: "+name);
        System.out.println("Member ID: "+memberID);
        System.out.println("Member Since?: "+memberSince);
        System.out.println("Annual Fee: "+annualFee);
    }
    abstract public void calcAnnualFee();
    
}