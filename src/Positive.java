
/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.*
 */


import java.util.Arrays;
import java.util.stream.IntStream;

public class Positive {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5,-5}));
    }

    public static int sum(int[]arr) {
       return IntStream.of(arr).filter(i->i >0).sum();
    }
}



