package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Person stefan = new Person("Stefan", 29, null, new Adres("96-124", "Maków", "Kasztanowa 1"));
        Person brajan = new Person("rajan", 5, null, new Adres("96-124", "Maków", "Brzosty 1"));
        Person dzesika = new Person("Dzesika", 6, null, new Adres("96-124", "Maków", "Brzosty 1"));
        Person janusz = new Person("anusz", 36, Collections.singletonList(brajan), new Adres("96-124", "Maków", "Kasztanowa 1"));
        Person dariusz = new Person("Dariusz", 39, Collections.singletonList(dzesika), new Adres("96-100", "Skierniewice", "Tuwima 3"));
        Person grazyna = new Person("Grazyna", 31, Arrays.asList(dzesika, brajan), new Adres("96-124", "Maków", "Kasztanowa 1"));
        Person mariola = new Person("Mariola", 22, Collections.EMPTY_LIST, new Adres("96-666", "Koluszki", "Dworcowa 1"));
        List<Person> personList = new ArrayList<>();
        personList.add(stefan);
        personList.add(brajan);
        personList.add(dzesika);
        personList.add(janusz);
        personList.add(dariusz);
        personList.add(grazyna);
        personList.add(mariola);

        //return list of places
        List<String> collect = personList.stream().map(t -> t.adres.town).collect(Collectors.toList());


        //return list of places withouth repetition
        List<String> collect1 = collect.stream().distinct().collect(Collectors.toList());

        //return list of places for people aged 30-40;
        List<String> collect2 = personList.stream().filter(year -> (year.getAge() >= 30) && (year.getAge() <= 40)).map(t -> t.adres.town).collect(Collectors.toList());
        System.out.println(collect2);
        // return list of places for people aged no repetitions
        List<String> collect3 = collect2.stream().distinct().collect(Collectors.toList());
        System.out.println(collect3);
        //retur list name kinder these people
       personList.stream().filter( r->(r.getAge()>29) &&(r.getAge()<41)).map()

    }
}
