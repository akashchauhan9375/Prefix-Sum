
/*
 Time complexity will be O(N) and space complexity will O(1)
 Since the array is sorted we will check for i and i-1 elemnt if they are same

 */
 

import java.util.*;

class DeleteDuplicateElementInArray2{
    public int remove(int arr[]){
        if(arr.length == 0){
            return -1;
        }

        int idx = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}