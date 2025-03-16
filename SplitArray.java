/*
 Split array with equal Sum
in this question it is asking to return true if rightSum and leftSum are equal
This is the brute force approach
 */


class SplitArray{
    public static boolean Split(int arr[]){
        int leftSum=0;
        int rightSum =0;
        int total = 0;
        

       
        for(int i=arr.length-1;i>0;i--){
            rightSum += arr[i];
            for(int j=0;j<i;j++){
                leftSum += arr[j];
            }

            if(leftSum == rightSum){
                return true;
            }

        }
        
       return false;

    }
    public static void main(String st[]){
        int arr[] = {1,1,2,4};
        System.out.println(Split(arr));
        
    }
}