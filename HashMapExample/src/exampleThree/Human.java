package exampleThree;

import java.util.Objects;

public class Human implements Cloneable {


    private int age;
    private String name;

    // Constructors
    public Human() {
        // Default constructor
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Human human = (Human) object;
        return age == human.age && Objects.equals(name, human.name);
    }
    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }


}
