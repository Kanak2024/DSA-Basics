public class MinInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,0};
        int min=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum is:"+min);
    }
}
