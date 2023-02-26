public class SwapTwoNumbers {
    public static void main(String[] args) {

//        Swaping two number using 3rd variable
        int a=5;
        int b=7;
        System.out.println("before Swaping a= "+a+" b="+b);
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("After Swaping a= "+a+" b="+b);

//        Without using 3rd variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swaping a= "+a+" b="+b);
    }
}
