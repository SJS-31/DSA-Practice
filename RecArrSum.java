public class RecArrSum {

        public static int Sum(int arr[], int n, int a0) {
            if (n == 1) {
                return a0;
            }
            
            a0=a0+arr[n - 1];
            
            return Sum(arr, n - 1, a0);
        }
        
        public static void main(String[] args) {
            int arr[] = { 1, 2, 3, 10,1,1,2};
            int n = arr.length;
            int a0= arr[0];
            int ans= Sum(arr, n,a0);
            
                System.out.println(ans);
            
        }
    
    
}
