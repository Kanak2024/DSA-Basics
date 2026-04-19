public class MaxArrayAlter {
   
    public static void main(String[] args) {
        int[] arr={-10,-2,-34,-56,-88,-11,-99};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                    max=arr[i];
            }
        }
        System.out.println("Maximum is:"+max);
    }
}


