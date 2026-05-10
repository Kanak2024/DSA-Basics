public class ShallowCopyOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,40,20,89,34};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums=arr; //Shallow Copy
        nums[0]=88;
        System.out.println(arr[0]);
    }
}
