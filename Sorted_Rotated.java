public class Sorted_Rotated {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int pivot = findPivot(nums);
        int temp=0;
        for(int i=pivot;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                temp++;
                break;
            }

        }

        for(int i=0;i<pivot-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                temp++;
                break;
            }

        }
        if(temp>0)
        System.out.println("Pivot: " + false);

        else
        System.out.println("Pivot: " + true);
    }

    public static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Pivot lies in the right half
                left = mid + 1;
            } else {
                // Pivot lies in the left half (including mid)
                right = mid;
            }
        }

        return left;
    }
}
