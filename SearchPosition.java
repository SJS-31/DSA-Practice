//Floor and Ceiling of a target value 
//For Floor = return e;
//For Ceil = return s;
public class SearchPosition {

    public static int binarySearch(int[] nums, int target)
    {
        int s = 0, e = nums.length - 1;
        int mid;
        mid = s + (e - s) / 2;

        while (s <=e) {
            

            if(nums[mid]==target)
            return nums[mid];

            else if(nums[mid]>target)
            e=mid-1;

            else
            s=mid+1;

            mid = s + (e - s) / 2;
            
        }
        return nums[e];
    }
    public static void main(String args[])
    {

        
        int nums[]={2,3,5,9,14,16,18};
        int target= 15;
        int ans= binarySearch(nums,target);
         if (ans != -1) {
            System.out.println("Target found at index " + ans);
        } else {
            System.out.println("Target not found");
    }
}
}

