package javaHashMap;

import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() method to compare objects based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode() to generate a hash code based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Overriding toString() for a meaningful string representation
    @Override
    public String toString() {
        return "Person{"+"name='"+name+'\''+", age="+age+'}';
    }
}