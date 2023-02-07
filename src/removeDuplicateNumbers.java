import java.util.Arrays;

public class removeDuplicateNumbers {
    public static void main(String[] args) {

//        WAP in java to remove the duplicate numbers from an array
        int arr [] = {1,2,4,1,5,16,5,16,8,9,7,5,8};
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }
}
