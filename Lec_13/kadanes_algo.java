package Lec_13;

public class kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {-9, -4, 2, -5, -5, -8, -9, 0, 9, 9, 19};
        System.out.println(kadane(arr));
    }

    public static int kadane(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int prevsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prevsum += arr[i];
            ans = Math.max(ans, prevsum);
            if (prevsum < 0) {
                prevsum = 0;
            }

        }
        return ans;
    }
}