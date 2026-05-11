public class RotateKTimes{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int k=5;
        k=k%n;
        reversePart(0, n-1, arr);
        reversePart(0, k-1, arr);
        reversePart(k, n-1, arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static int[] reversePart(int i,int j,int[] arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}