public class sqnum {
    public static void main(String[] args) {
        int n=6;

        int s = 0, e = n/2;
        int mid;
        int ass=5;
        mid = s + (e - s) / 2;

        while (s < e) {
            

            if(mid*mid==n)
            {
            ass=mid;
            break;
            }
            else if(mid*mid>n)
            e=mid-1;

            else
            s=mid+1;

            mid = s + (e - s) / 2;
            
        }
        if(ass!=5)
        System.out.println(mid);
        else
        System.out.println(mid);    
    
}
}


