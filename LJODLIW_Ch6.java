package ljodliw;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LJODLIW_Ch6 {

    public static void main(String[] args) {
        //6.3 Looping Statements
        
        int i = 3;
        for( i--; i<3; i=4) 
            System.out.println(i);
        //1st part is executed once only before entering loop 
        //2nd part is executed after 1st part & end of evry loop after 3rd part
        //3rd part is executed at the end of evry loop

        //for loop used to print array elements
        int[] numArray = {21, 31, 43, 54, 76};
        int j;
        for (j = 0; j < numArray.length; j++) {
            System.out.print(numArray[j] +" ");
        }
        System.out.println("\nj = "+j);
        
        //enhanced for loop - for arrays & Collections
        for (int num : numArray) {
            System.out.println(num);    
        }
        

        //6.5 Exception Handling
        // General?
        // Throwing Exceptions
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("\n\n10 / ?");
            System.out.print("plis enter denominator: ");
            int num = s.nextInt();
            if (num == 1) {
                throw new Exception();  //thrown to catch (Exception e)
            }
            int result = 10 / num;
            System.out.println("10 / " + num + " = " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("----End of Error Handling Example----\n");
        }

        //Specific Errors
        try {
            System.out.print("enter an integer: ");
            int num = s.nextInt();
            int result = num / 2;
            System.out.println("here's your number halved : " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: ya didn't enter an integer");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
