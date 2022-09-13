public class SmashWords {

    public static void main(String[] args) {
        System.out.println(smash("ala", "kota"));
    }
    public static String smash(String... words){
        return String.join(" ",words);
    }
}
