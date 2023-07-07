// import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
       int arr[]={2,3,5,8};

        int s = 0, e = arr.length - 1;
        int mid;
        mid = s + (e - s) / 2;

        while (s < e) {
           
            if(arr[mid]>=arr[0])
            s=mid+1;

            else
            e=mid;

            mid = s + (e - s) / 2;

            if(arr[mid]==3)
            System.out.println("True");
            
        }
        System.out.println(mid);

    }
}