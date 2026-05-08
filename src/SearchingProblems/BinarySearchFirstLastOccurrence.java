package SearchingProblems;

public class BinarySearchFirstLastOccurrence {

    public static int firstOccurrence(int[] arr,
                                      int target) {

        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                result = mid;
                right = mid - 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] arr,
                                     int target) {

        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                result = mid;
                left = mid + 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4};

        int first = firstOccurrence(arr, 2);
        int last = lastOccurrence(arr, 2);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}