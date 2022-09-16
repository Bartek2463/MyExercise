import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public static void main(String[] args) {
        System.out.println(list(List.of("a", "b", "ggg", 4, 7, 9)));
    }
    public static List<Object> list(List<Object> list){
        return list.stream().filter(e->e instanceof Integer).collect(Collectors.toList());
    }
}
