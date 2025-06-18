import java.util.Stack;

public class ReverseArray {
    public static void reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverse(arr);

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
