// With TC O(N^3) and SC O(1)

class ThreeSum1{

    public static boolean Sum(int arr[],int target){
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        return true; 
                }
            }
        }
        return false;

    }
    public static void main(String st[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 12;
        System.out.println(Sum(arr,target));
    
    }
}