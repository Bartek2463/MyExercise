public class Main {
    public static void main(String[] args) {
        System.out.println(Sum(10, -3));
    }
    public static int Sum( int a, int b){
        int sum = 0;
        for (int i = Math.min(a,b); i <=Math.max(a,b) ; i++) {
            sum+=i;
        }
        return sum;
    }
}