import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountBig {
    public static void main(String[] args) {
        nbDig(10, 1);
    }

    public static int nbDig(int a, int b) {
        long count = IntStream
                .rangeClosed(0, a)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char) i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == b)
                .count();
        System.out.println(count);

        return 1;
    }
}
