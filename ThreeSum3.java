//*****************************************************With TC O(N^2) and SC O(1)......MOST EFFICIENT ********************** */
class ThreeSum{

    public static boolean Sum(int arr[],int target){
        int len = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<len-2;i++){
            int left = i+1;
            int right = len-1;
            int requiredSum = target - arr[i];
            while(left<right){
                if(arr[left]+arr[right] == requiredSum){
                    return true;
                }
                if(arr[left]+arr[right] < requiredSum){
                    left++;
                }
                else if(arr[left]+arr[right] > requiredSum){
                    right--;
                }
            }
        
        }
        return false;
    }
    
    
    public static void main(String st[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 12;
        System.out.print(Sum(arr, target));

    }
}