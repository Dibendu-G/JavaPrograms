import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class CleariThBit {
    public static void main(String[] args) {

//        Logic to clear nth bit of a number
//        To clear nth bit of a number we will use combination of bitwise left shift <<,
//        bitwise complement ~ and bitwise AND & operator.
//
//        Below is the step by step descriptive logic to clear nth bit of a number.
//
//        1.    Input number and nth bit position to clear from user.
//              Store it in some variable say num and n.
//        2.    Left shift 1, n times i.e. 1 << n.
//        3.    Perform bitwise complement with the above result.
//              So that the nth bit becomes unset and rest of bit becomes set i.e. ~ (1 << n).
//        4.    Finally, perform bitwise AND operation with the above result and num.
//              The above three steps together can be written as num & (~ (1 << n));

        Scanner sc = new Scanner(System.in);
        int num,n,newNum;
        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        System.out.println("Enter the bit u want to clear: ");
        n=sc.nextInt();

        newNum = num & (~(1 << n));

        System.out.println("Bit cleared successfully.\n\n");
        System.out.println("Number before clearing " +n+" bit: " +num+" (in decimal)\n");
        System.out.println("Number after clearing "+n+" bit: " +newNum+" (in decimal)\n");
    }
}
