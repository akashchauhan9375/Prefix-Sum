
/*
Time complexity will O(N) 

 */

class PrefixSumQuery{
    public static int QuerySum(int arr[],int i, int j){
        int sum =0;
        for(int k=i;k<=j;k++){
            sum += arr[k];
        }
        return sum;
    }
    public static void main(String st[]){
        int arr[] = {3,1,4,1,5,9};
        System.out.println(QuerySum(arr, 1, 3));
    }
}