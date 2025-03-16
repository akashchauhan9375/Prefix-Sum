//With TIME COMPLEXITY = N^2 and  SPACE COMPLEXITY = O(1)
/*
************************************************ BRUTE FORCE APPROACH*********************************************


 */

class PivotIndex2 {
    static int Equilibrium(int[] arr) {
      
        
        for (int i = 0; i < arr.length; ++i) {
          
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];

            
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,5};
        System.out.println(Equilibrium(arr));
    }
}