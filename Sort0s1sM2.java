public class Sort0s1sM2 {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i]==0)i++;
            else if(arr[j]!=0) j--;

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
