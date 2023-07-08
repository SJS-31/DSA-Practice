public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,8,6,8,10};
        for(int i=0;i<arr.length-1;i++)
		{
            int min_idx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
                min_idx=j;

				{
					temp=arr[i];
					arr[i]=arr[min_idx];
					arr[min_idx]=temp;
				}
			}
		}
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
