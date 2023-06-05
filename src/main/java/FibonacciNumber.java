public class FibonacciNumber {

    public int fib(int n) {
        int now=1;
        int prev=1;
        for(int i=1; i<n; i++){
            int temp=now;
            now=now +prev;
            prev=temp;
        }
        return now;

    }
}
