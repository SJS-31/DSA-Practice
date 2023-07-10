public class MoveZeros {
    public static void main(String[] args) {
        int nums[]={0};
        int n=nums.length-1;
        int m=0;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                arr[n]=0;
                n--;
            }
            else{
                arr[m]=nums[i];
                m++;
            }
           
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
