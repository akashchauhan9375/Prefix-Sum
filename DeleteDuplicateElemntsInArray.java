

/*        
 Time complexity and space complexity will be O(N) 
 */
import java.util.*;

class DeleteDuplicateElementinArray {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int idx =0;

        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}