import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class MembershipManagement {
    final private Scanner reader = new Scanner(System.in);
    
    private int getIntInput(){
        int choice = 0;
        
        while(choice==0){
            try {
                choice = reader.nextInt();
                if(choice ==0)
                        throw new InputMismatchException();
                reader.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("***********Invalid Input***********\n");
                System.out.print("ERROR: INVALID INPUT. Please try again: ");
            }
        }
        return choice;
    }
    
    private void printClubOptions(){
        System.out.println("1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Multi Clubs");
    }
    
    public int getChoice(){
        int choice;
        
        System.out.println("WELCOME TO OZONE FITNESS CENTER");
        System.out.println("================================");
        System.out.println("1) Add Member");
        System.out.println("2) Remove Member");
        System.out.println("3) Display Member Information\n");
        System.out.print("Please select an option (or Enter -1 to quit) : ");
        choice = getIntInput();
        
        return choice;
    }

    //is the LinkedList just a list of the new member's details
    // OR is the LinkedList a list of the previous members' details AND the new member's details ?
    // Assuming it's the list of already registered members excluding the new member
    // It is ^^
    public String addMembers(LinkedList<Member> m){
        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> calc;
        
        System.out.println("Please enter your name: ");
        name = reader.nextLine();
        
        printClubOptions();
        System.out.print("Please enter club ID: ");
        club = getIntInput();
        while(club<1 || club>4){
            System.out.print("ERROR: INVALID INPUT. Try again: ");
            club = getIntInput();
        }
        
        if (m.size()>0)
            memberID = m.getLast().getMemberID() + 1;
        else
            memberID = 1;

        if (club!=4) {
            calc = (n) -> {
                switch(n){
                    case 1: return 900;
                    case 2: return 950;
                    case 3: return 1000;
                    default: return -1;
                }
            };
            fees = calc.calcFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Single Club Member added\n");
        } else {
            calc = (n) -> {
                switch(n){
                    case 4: return 1200;
                    default: return -1;
                }
            };
            fees = calc.calcFees(club);
            mbr = new MultiClubMember('M', memberID, name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Multi Club Member added\n");
        }

        return mem;
    }

    public void removeMember(LinkedList<Member> m){
            
        int memberID;
        System.out.print("Insert the Member ID of the person to be removed: ");
        memberID = getIntInput();

        for (int i = 0; i < m.size(); i++) {
            if(m.get(i).getMemberID()== memberID){
                m.remove(i);
                System.out.println("XXXXXXXXXXXXXX The deed is done XXXXXXXXXXXXXX");
                return;
            }
        }
        System.out.println("Member ID "+memberID+" not found");
    }

    public void printMemberInfo(LinkedList<Member> m){

        int memberID;
        System.out.print("Insert Member ID of the person to find info on: ");
        memberID = getIntInput();

        for (int i = 0; i < m.size(); i++) {
            if(m.get(i).getMemberID()== memberID){
                String[] memberInfo = m.get(i).toString().split(", ");
                if (memberInfo[0].equals('S')){
                    System.out.println("Member Type = S");
                    System.out.println("Member ID = "+memberInfo[1]);
                    System.out.println("Member Name = "+memberInfo[2]);
                    System.out.println("Membership Fees = "+memberInfo[3]);
                    System.out.println("Club ID = "+memberInfo[4]);
                } else{
                    System.out.println("Member Type = M");
                    System.out.println("Member ID = "+memberInfo[1]);
                    System.out.println("Member Name = "+memberInfo[2]);
                    System.out.println("Membership Fees = "+memberInfo[3]);
                    System.out.println("Membership Points = "+memberInfo[4]);
                }
            }
        }
        System.out.println("Member ID "+memberID+" not found");
    }

}