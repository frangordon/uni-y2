public class Shape {

    public long isMultiple(long n, long m) {
        long i = 0;
        if (n == m * i) {
            return n;
        }
        return 0;
    }

    public static boolean isOdd(int i){
        if ((i & 1) == 1){
            return true;
        }
        else {
            return false;
        }
    }

}