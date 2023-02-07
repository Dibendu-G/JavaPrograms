import java.util.Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {

//        WAP to merge two array

        int a[] ={4,5,6,7};
        int b[] ={1,8,9,3,2};
        int c[] = new int[a.length+ b.length];
        int ci =0;
        for (int i=0;i<a.length;i++)
        {
            c[ci]=a[i];
            ci++;
        }
        for (int i=0;i<b.length;i++)
        {
            c[ci]=b[i];
            ci++;
        }
        System.out.println(Arrays.toString(c));
    }
}
