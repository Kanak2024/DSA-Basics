public class SecondMax {
    public static void main(String[] args) {
        int[] arr={10,20,30,90,77};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                    max=Math.max(max,arr[i]);
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                smax=arr[i];
            }
        }

        System.out.println("Maximum is:"+max);
        System.out.println("Second Maximum is:"+smax);
    }
}
