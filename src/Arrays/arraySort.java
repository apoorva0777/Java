package Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] arr = {100, 20, 13, 400, 50};
        arr = sortArray(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int... arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
