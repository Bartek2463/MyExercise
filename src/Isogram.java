import java.util.stream.IntStream;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isoGram("moOse"));
    }
    public static  boolean isoGram(String str){
        return str.length()== str.chars().distinct().count();
    }
}
