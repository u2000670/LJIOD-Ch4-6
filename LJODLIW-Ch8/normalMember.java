package inheritancedemo;

//child class (normalMember) can use all public/protected fields & methods of parent class (member)
public class normalMember extends member {
    public normalMember(String pName, int pMemberID, int pMemberSince){
        super (pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 params");
    }
    public normalMember(){
        System.out.println("Child constructor with no parameter");
    }
    
    @Override
    public void calcAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100+12*30);
    }
}
