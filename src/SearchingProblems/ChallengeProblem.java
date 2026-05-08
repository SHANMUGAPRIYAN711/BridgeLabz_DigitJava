package SearchingProblems;

import java.util.Arrays;

public class ChallengeProblem {

    // First Missing Positive
    public static int firstMissingPositive(int[] arr) {

        Arrays.sort(arr);

        int missing = 1;

        for (int num : arr) {

            if (num == missing) {

                missing++;
            }
        }

        return missing;
    }

    // Binary Search
    public static int binarySearch(int[] arr,
                                   int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                return mid;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        int missing =
                firstMissingPositive(arr);

        System.out.println(
                "First Missing Positive: "
                        + missing
        );

        Arrays.sort(arr);

        int index = binarySearch(arr, 4);

        System.out.println(
                "Index of 4: " + index
        );
    }
}