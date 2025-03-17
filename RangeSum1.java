public class Main {
    
    // Function to compute sum in given range
    static int rangeSum(int[] arr, int i, int j) {
        int sum = 0;

        // Compute sum from i to j
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(rangeSum(arr, 1, 3));
        System.out.println(rangeSum(arr, 2, 4));
    }
}