public class MaxAndMinInAnArray {
    public static void main(String[] args) {

//        WAP to find MAX and MIN in an array

        int arr [] = {10,342855,2,90,9808};
        int min = arr[0];
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
            }
            if(max>arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The Maximum Element in an array is "+max);
        System.out.println("The Minimum Element in an array is "+min);
    }
}
