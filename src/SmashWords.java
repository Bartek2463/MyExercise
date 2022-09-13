import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmashWords {

    public static void main(String[] args) {
        System.out.println(smash("ala", "kota"));
    }
    public static String smash(String... words){
     return Stream.of(words).collect(Collectors.joining(" "));
    }
}
