package ibm;

public class ArraySum {
    public static int[] arrayChallenge(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    counter -= Math.abs(arr[j] - arr[i]);
                } else {
                    counter += Math.abs(arr[j] - arr[i]);
                }
            }
            result[i] = counter;
            counter = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample input
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {1, 2, 2, 3};

        // Sample output
        int[] result1 = arrayChallenge(arr1);
        int[] result2 = arrayChallenge(arr2);

        // Printing the output
        for (int num : result1) {
            System.out.println(num);
        }

        for (int num : result2) {
            System.out.println(num);
        }
    }
}
