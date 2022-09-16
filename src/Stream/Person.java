package Stream;

import java.util.List;

public class Person {
    String name;
    Integer age;
    List<Person> personList;

    public Person(String name, Integer age, List<Person> personList, Adres adres) {
        this.name = name;
        this.age = age;
        this.personList = personList;
        this.adres = adres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Adres getAdres() {
        return adres;
    }

    Adres adres;
}
