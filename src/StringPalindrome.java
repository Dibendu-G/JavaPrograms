import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

//        Check whether the given string is palindrome or not
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        while (i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Yes it's Paindrome");
    }
}
