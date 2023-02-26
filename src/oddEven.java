import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number u want to check ");
        int n= sc.nextInt();

//        General way
//        if(n%2==0){
//            System.out.println("Number is even ");
//        }
//        else {
//            System.out.println("Number is odd");
//        }

//        Using Bitwise operator
        if((n&1)==0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
