package inheritancedemo;

public class vipMember extends member{
    
    public vipMember (String pName, int pMemberID, int pMemberSince){
        super (pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 params");
    }
    
    @Override
    public void calcAnnualFee(){
        annualFee = (1-0.01*getDiscount())*1200;
    }
    
    
}
