public class MountainArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2};

        int s = 0, e = arr.length - 1;
        int mid;
        mid = s + (e - s) / 2;

        while (s < e) {
            

            if(arr[mid]<=arr[mid+1])
            s=mid+1;

            else
            e=mid;

            mid = s + (e - s) / 2;
            
        }
        System.out.println(mid);
    
}
}


