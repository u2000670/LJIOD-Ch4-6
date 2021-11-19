package inheritancedemo;

public class InheritanceDemo {
    public static void main(String[] args) {
//        normalMember normie1 = new normalMember("Jamie", 12, 2019);
//        vipMember vip1 = new vipMember("Carlos", 21, 2018);
//        
//        normie1.calcAnnualFee();
//        vip1.calcAnnualFee();
//        
//        normie1.displayMemInfo();
//        vip1.displayMemInfo();
//        
//        System.out.println("\n--------------------");
//        normie1.setDiscount();
//        normie1.calcAnnualFee();
//        normie1.displayMemInfo();

        //8.2 Polymorphism
        member[] clubMember = new member[6];
        
        clubMember[0] = new normalMember("Jamie", 12, 2019);
        clubMember[1] = new normalMember("Revera", 14, 2019);
        clubMember[2] = new normalMember("Bob", 2, 2016);
        clubMember[3] = new vipMember("Harold", 9, 2020);
        clubMember[4] = new vipMember("Lancet", 6, 2012);
        clubMember[5] = new vipMember("Carl", 5, 2011);
        
        System.out.println("\n----------------------------------");
        for (member m : clubMember) {
            m.calcAnnualFee();
            m.displayMemInfo();
            System.out.println("");
            
        }
        
        
    }
    
}
