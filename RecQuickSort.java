
public class RecQuickSort {

    public static void quickSort(int []arr, int s, int e) {
        if(s>=e)
            return;

        int p = partiton(arr, s,e);

        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }

    public static int partiton(int []arr,int s, int e) {
        int count =0;
        for (int i=s+1; i<=e;i++)
        {
            if(arr[s]>arr[i])
            count++;
        }

        int p= s+count;

        int temp=arr[p];
        arr[p]=arr[s];
        arr[s]=temp;


        while(s< p && e>p)
        {
            
            while(arr[s]<arr[p])
            s++;

            while(arr[e]>arr[p])
            e--;

            if(arr[s]>arr[p] && arr[e]<arr[p])
            {
                temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }

        }
        return p;
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,999,7};
        
        quickSort(arr, 0, 5);

        for(int i=0; i<6;i++)
        {
            // System.out.println("arr");
            System.out.print(arr[i]);
        }
    }
}
