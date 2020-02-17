package Paket.Lesson2.Lesson3;

import java.util.Objects;

public class Person {

    public static void main(String[] args) {

        Person person = new Person("Masha");
        Person person2 = new Person("Masha");
        System.out.println(person);
        System.out.println(person2.equals(person));
    }

 private String name;

 public Person(String name) {
     this.name = name;
 }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
