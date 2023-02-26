import java.util.Scanner;

public class setNthBitOfaNumber {
    public static void main(String[] args) {

//        Logic to set nth bit of a number
//        We use bitwise OR | operator to set any bit of a number.
//        Bitwise OR operator evaluate each bit of the resultant value to 1
//        if any of the operand corresponding bit is 1.
//
//        Step by step descriptive logic to set nth bit of a number.
//
//        1. Input number from user. Store it in some variable say num.
//        2. Input bit position you want to set. Store it in some variable say n.
//        3. To set a particular bit of number.
//        Left shift 1 n times and perform bitwise OR operation with num.
//        Which is newNum = (1 << n) | num;.

        Scanner sc = new Scanner(System.in);
        int num,n,newNum;
        System.out.println("Enter the Number : ");
        num= sc.nextInt();
        System.out.println("Enter the nth bit you want to change :");
        n= sc.nextInt();

        newNum=(1<<n)|num;

        System.out.println("Bit set successfully.\n\n");
        System.out.println("Number before setting "+n+ " bit: "+num+"(in decimal)\n");
        System.out.println("Number after setting "+n+ " bit: "+newNum+ "(in decimal)\n");
    }
}
