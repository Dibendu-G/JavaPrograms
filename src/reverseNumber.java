import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to reverse : ");
        int n = sc.nextInt();
        int lastDigit,reverse=0;
        while (n>0){
            lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        System.out.println("The reverse number is "+reverse);
    }
}
