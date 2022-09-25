import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwotoOne {
    public static void main(String[] args) {
longtest("asdewfghjksdf","qwertyuiokjgf");
    }
    public  static String longtest(String s, String c){
        String f = s+c;
        List<String>list = new ArrayList<>();
        list.add(f);
        List<String> collect = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(collect);

        return null;
    }
}
