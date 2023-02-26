import java.util.Scanner;

public class findithBit {
    public static void main(String[] args) {

//        Step by step descriptive logic to get nth bit of a number.
//
//       1. Input number from user. Store it in some variable say num.
//       2. Input the bit position from user.   Store it in some variable say n.
//       3. To get the nth bit of num right shift num, n times.
//       4. Then perform bitwise AND with 1     i.e. bitStatus = (num >> n) & 1;.

        Scanner sc = new Scanner(System.in);
        int num, n,BitStatus;
        System.out.println("Enter Any number: ");
        num = sc.nextInt();
        System.out.println("Enter the i'th bit to check : ");
        n = sc.nextInt();

        BitStatus=(num>>n)&1;
        System.out.println("The i'th bit is set to :"+BitStatus);
    }
}
