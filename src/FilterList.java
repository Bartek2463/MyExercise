import java.util.List;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        System.out.println(list(List.of("a", "b", "c", 1, 2, 3, 4)));
    }
    public static List<Object> list (List<Object> list){
       return list.stream().filter(e->e instanceof Integer)
                .collect(Collectors.toList());



    }
}
