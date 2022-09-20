import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(List.of("a", "b", "c")));
    }



    public static List<String>  number(List<String> list){
        ArrayList<String> arrayList = new ArrayList<>();
        int i =0;
        for (String s: list) {
            arrayList.add(++i+ ": "+s);
        }
        return arrayList;
    }
}
