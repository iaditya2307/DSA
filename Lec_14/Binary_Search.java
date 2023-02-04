package Lec_14;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 12};
        int item = 8;

        System.out.println(search(arr, item));

    }

    public static int search(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                hi = mid - 1;

            } else {
                lo = mid + 1;
            }

        }
        return -1;
    }
}

