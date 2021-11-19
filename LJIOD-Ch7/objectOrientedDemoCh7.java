package ljodliw.LJODLIW_Ch7;

public class objectOrientedDemoCh7 {
    
    public static void main(String[] args) {
        
        //Classname objectName= new ClassName(arg)
        StaffCh7 staff1 = new StaffCh7("John");   //creating a Staff object || instance of staff1
        //staff1.hoursWorked = 200; 
        //would give error as hoursWorked is a private field of Staff class
        staff1.setHoursWorked(200);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = "+pay);
        
        StaffCh7 staff2 = new StaffCh7("Marshal","Lee");
        staff2.setHoursWorked(240);
        pay = staff2.calculatePay();
        System.out.println("Pay = " +pay);
        
        System.out.println("\nUpdating Marshal Lee's Hours Worked to -2");
        staff2.setHoursWorked(-2);
        pay = staff2.calculatePay();
        System.out.println("Hours Worked = " + staff2.getHoursWorked());
        System.out.println("Pay = " +pay);
    }
    
    
    
    
}
