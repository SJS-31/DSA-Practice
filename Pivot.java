// import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
       int arr[]={7,9,10,2,3};

        int s = 0, e = arr.length - 1;
        int mid;
        mid = s + (e - s) / 2;

        while (s < e) {
            
            if(arr[mid]>=arr[0])
            s=mid+1;

            else
            e=mid;

            mid = s + (e - s) / 2;
            
        }
        System.out.println(mid);

    }
}