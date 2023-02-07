import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int reverse=0,lastdigit;
        while (n>0){
            lastdigit= n%10;
            reverse = reverse*10+lastdigit;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Not PAlindrome");
        }
    }
}
