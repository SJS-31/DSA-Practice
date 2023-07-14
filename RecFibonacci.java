public class RecFibonacci {
    public static void main(String[] args) {
        int n=6;
        int ans= fib(n);
        System.out.println(ans);
    }

    public static int fib(int n)
    {
        if(n==0)
        return 0;
        
        if(n==1)
        return 1;

        return fib(n-1)+fib(n-2);
    }
}
