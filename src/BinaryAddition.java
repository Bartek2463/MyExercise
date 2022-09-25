public class BinaryAddition {

    public static void main(String[] args) {
        System.out.println(binaryAddition(4, 6));
    }
     public static String binaryAddition(int a, int b){

           return  Integer.toBinaryString(a+b);
     }
}
