public class RecLinearSearch {

        public static boolean isSorted(int arr[], int n) {
            if (n == 0) {
                return false;
            }
            
            if (arr[n - 1] ==6) {
                return true;
            }
            
            return isSorted(arr, n - 1);
        }
        
        public static void main(String[] args) {
            int arr[] = { 1, 2, 6,4, 5, 6};
            int n = arr.length;
            
            if (isSorted(arr, n)) {
                System.out.println("The array is sorted.");
            } else {
                System.out.println("The array is not sorted.");
            }
        }
    
    
}
