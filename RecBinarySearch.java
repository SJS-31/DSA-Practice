public class RecBinarySearch {

    public static int binarySearch(int []nums, int target, int s, int e){
        int mid=s+(e-s)/2;

        if(s>e)
        return -1;

        if(nums[mid]==target)
        return mid;

        else if(nums[mid]>target)
        return binarySearch(nums, target, s, mid-1 );

        else
         return binarySearch(nums, target, mid+1, e );
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int target=6;
        int s=0;
        int e=nums.length - 1;
        System.out.println(binarySearch(nums, target, s, e ));
    }

}
