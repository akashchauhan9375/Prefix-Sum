// TC O(N) and TC O(1)

/*
 
This is the most optimized approach....In this approach first we will find the total sum and stores in the rightSum.
Then we run a for loop in which  rightSum and leftSum both will be pointing at the 0th index of the array.
Moving forward, we will subtract array elemnt value from rightSum(which is already calculated) and compares to leftSum(which is 0 in the 1st iteration).
Next, we will check for condition and after that we will update the leftSum by adding array element to it(as it iterating and moving over all the elemnts of array)...
As soon the rightSum equals to leftSum,return ith index(pivot element index)

 */

class PivotIndex{
    public static int pivot(int arr[]){
        int leftSum =0;
        int rightSum = 0;

        for(int num : arr){
            rightSum += num;
        }
        for(int i=0;i<arr.length;i++){
            rightSum -= arr[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += arr[i]; 
        }
        return -1;

    }

    public static void main(String st[]){
        int arr [] = {1,1,1,1,1,1,5};
        System.out.println(pivot(arr));

    }
}