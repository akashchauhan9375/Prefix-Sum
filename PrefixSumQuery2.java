
/*
 

 Prefix Sum – O(1) for Every Query and O(n) Space
 */


class PrefixSumQuery2{
    public static void PreSum(int arr[],int pre[]){
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1] + arr[i];
        }
    }

    public static int QuerySum(int i,int j,int pre[]){
        if(i==0){
            return pre[j];
        }
        return pre[j] - pre[i-1];
    }
    public static void main(String[] args) {
        
    }
}