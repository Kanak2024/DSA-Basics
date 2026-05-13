public class Sort01{
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,1,1,0};
        int count0=0;
        int count1=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else count1++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0+1;i<arr.length;i++){
            arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}