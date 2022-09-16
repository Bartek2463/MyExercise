import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("czech"));
    }


    public static String greet(String language) {
        Map<String, String> greeting = new HashMap<>();


        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        greeting.put("estonian", "Tere tulemast");
        greeting.put("finnish", "Tervetuloa");
        greeting.put("flemish", "Welgekomen");
        greeting.put("french", "Bienvenue");
        greeting.put("german", "Willkommen");
        greeting.put("irish", "Failte");
        greeting.put("italian", "Benvenuto");
        greeting.put("latvian", "Gaidits");
        greeting.put("lithuanian", "Laukiamas");
        greeting.put("polish", "Witamy");
        greeting.put("spanish", "Bienvenido");
        greeting.put("swedish", "Valkommen");
        greeting.put("welsh", "Croeso");


         return greeting.containsKey(language)?greeting.get(language):greeting.get("english");


    }

}
