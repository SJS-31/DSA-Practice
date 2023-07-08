public class InfiniteArray {

    public static int binarySearch(int[] nums, int target, int s, int e) {

        int mid;
        mid = s + (e - s) / 2;

        while (s <= e) {

            if (nums[mid] == target)
                return nums[mid];

            else if (nums[mid] > target)
                e = mid - 1;

            else
                s = mid + 1;

            mid = s + (e - s) / 2;

        }

        return nums[e];
    }

    public static int range(int[] nums, int target) {

        int s = 0, e = 1;
        while (target > nums[e]) {
            int temp = e + 1;
            e = e + (e - s + 1) * 2;
            s = temp;
        }

        return binarySearch(nums, target, s, e);
    }

    public static void main(String args[]) {

        int nums[] = { 2, 3, 5, 9, 14, 16, 18, 20, 22, 25, 26, 28, 27, 29, 30 };
        int target = 30;

        System.out.println( range(nums, target));
        // if (ans != -1) {
        //     System.out.println("Target found at index " + ans);
        // } else {
        //     System.out.println("Target not found");
        // }
    }
}