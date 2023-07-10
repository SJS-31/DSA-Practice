public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,8,6,7};
        int k=3;
        int n=nums.length;
        int[] arr = new int[nums.length];

        for(int i =0;i<k;i++)
        {
            arr[i]=nums[n-1];
            n--;
        }
        for(int i =0;i<nums.length-k;i++)
        {
            arr[i+k]=nums[i];
        }
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
