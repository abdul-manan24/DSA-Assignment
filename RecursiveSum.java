public class RecursiveSum {
    public static int recursiveSum(int[] arr, int n) {
        if (n == 0)
            return 0;
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 13, 78};
        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int sum = recursiveSum(arr, arr.length);
        System.out.println("\nSum of Array: " + sum);
    }
}
