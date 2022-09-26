import java.util.Objects;
import java.util.Scanner;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public boolean equals(Person otherPerson) {
        if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
            return true;
        }
        else {
            return false;
        }
    }

    public int hashCode() {
//        return this.name.hashCode() ^ Integer.toString(this.age).hashCode();
        return Objects.hash(this.age, this.name);
    }

    public String findName() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi user, write down some name for me:\n");
        String name = scan.nextLine();

        Person[] personArray = new Person[5];
        for (Person p: personArray) {
            if (name.equalsIgnoreCase(p.getName())) {
                p.toString();
            }
            else {
                System.out.println("We did not find the person with this name");
            }
        }
        return "See you next time";
    }



}
