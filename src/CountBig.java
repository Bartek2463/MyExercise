import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountBig {
    public static void main(String[] args) {
        System.out.println(nbDig(11549, 1));
    }

    public static int nbDig(int a, int b) {
         return (int)IntStream
                .rangeClosed(0,a)
                .map(i -> i*i)
                .flatMap(i ->String.valueOf(i).chars())
                .mapToObj(i->(char)i)
                .mapToInt(Character::getNumericValue)
                .filter(i->i==b)
                .count();



    }
}
