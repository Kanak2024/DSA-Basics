import java.util.Arrays;

public class DeepCopyOfArray {
    public static void main(String[] args) {
        {
        int[] arr={10,20,40,20,89,34};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] brr=Arrays.copyOf(arr, arr.length);
        brr[0]=70;
        System.out.println(arr[0]);
        System.out.println(brr[0]);
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
    }
}
