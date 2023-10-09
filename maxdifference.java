public class MaxDiffe{
    static int maxdifference(int arr[]){
        int n=arr.length;
        int res=arr[1]-arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                if(diff>res){
                    res=diff; 
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {9,4,3,2 };
        System.out.println(maxdifference(arr));
    }
}
