/*

Thi is the optimal approach to solve Range Sum Query Question
Time complexity will O(1)


 */


class RangeSum2{
    public static void PreSum(int arr[],int pre[]){
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1] + arr[i];
        }
    }

    public static int RangeSum(int pre[], int i,int j){
        if(i==0){
            return pre[j];
        }
        else{
            return pre[j] - pre[i-1];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int pre[] = new int[arr.length];
        

    }
}