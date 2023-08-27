public class BubbleSort {
    
    public static void main(String[] args) {
        int arr[]={4,8,6,8,10};
        int n=arr.length;
        for(int i=1;i<n;i++)
		{
            
			for(int j=0;j<n-i;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
           for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
