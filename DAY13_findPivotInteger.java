public class DAY13_findPivotInteger {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
    static int pivotInteger(int n) {
        int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);

        if( a- Math.ceil(a)==0) return (int)a;
        else return -1;
    }
}
