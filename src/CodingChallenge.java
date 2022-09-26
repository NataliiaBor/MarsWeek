import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CodingChallenge {

    public static String findName(Person[] personArray) {
        int count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi user, write down some name for me:\n");
        String name = scan.nextLine();

        for (Person p: personArray) {
            if (name.equalsIgnoreCase(p.getName())) {
                System.out.println("We found this person!\n" + p.name + " " + p.age);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No match found!");
        }
        return "";
    }

    public static String findByID(HashMap<Integer, Person> people) {
        int count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi user, write down some 5-digit ID number for me:\n");
        Integer userID = scan.nextInt();

        for (HashMap<Integer, Person> p: people) {
            if (userID == p.get()) {
                System.out.println("We found this person!\n" + p.name + " " + p.age);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No match found!");
        }
        return "";
    }

    public static void main(String[] args) {

        //coding challenge 01.02   09/21/2022
        String[] names = new String[5];
        names[0] = "Bob";
        names[1] = "Alphonse";
        names[2] = "Lily";
        names[3] = "Marcus";
        names[4] = "Jess";

        int[] ages = new int[] { 28, 30, 25, 22, 20 };

        for (int i = 0; i < names.length; i++) {
             if (names[i].equals("Bob") && ages[i] < 24) {
                 System.out.println(i + ": Banned");
             }
             else if (names[i].equals("Bob")) {
                 System.out.println(i + ": Banned");
             }
             else if (ages[i] < 24) {
                 System.out.println(i + ": Banned");
             }
             else {
                 System.out.println(i + ": Allowed");
             }
        }

//        boolean isAllowed;
//        for (int i = 0; i < names.length; i++) {
////            if (names[i].equals("Bob") || ages[i] < 24) {
////                isAllowed = false;
////                System.out.println(i + ": Banned");
////            }
////            else {
////                isAllowed = true;
////                System.out.println(i + ": Allowed");
////            }
//            System.out.println(i + ": " + ((ages[i] < 24 ||  names[i].equals("Bob"))?"Banned":"Allowed"));
//        }

        // coding challenge 01.03   09/22/22
        Person person1 = new Person("Bob", 28);
        Person person2 = new Person("Alphonse", 30);
        Person person3 = new Person("Lily", 25);
        Person person4 = new Person("Marcus", 22);
        Person person5 = new Person("Jess", 20);


        // coding challenge 09/23/2022
        Person[] personArray = {person1, person2, person3, person4, person5};

        System.out.println("Please enter a name to search for: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        boolean matchFound = false;

        for (Person p: personArray) {
            if (p.name.equalsIgnoreCase(name)) {
                p.toString();
                System.out.println("Match: " + p.name + " " + p.age);
                matchFound = true;
            }
        }
        if(!matchFound) {
            System.out.println("No match found!");
        }

        findName(personArray);


        // coding challenge 09/26/2022
        HashMap<Integer, Person> people = new HashMap<Integer, Person> ();
        people.put(13530, person1);
        people.put(48851, person2);
        people.put(97531, person3);
        people.put(25545, person4);
        people.put(92862, person5);

//        int[] ages = new int[] {28,30,25,22,20};
        int[] id = {13530, 48851, 97531, 25545, 92862};

        Map<Integer, Person> people1 = new HashMap<Integer, Person>();

        people1.put(id[0], new Person(names[0], ages[0]));

        for (int i = 0; i < names.length; i++) {
            people1.put(id[i], new Person(names[i], ages[i]));
        }
        System.out.println(people1);

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter an ID: ");
        int searchID = input1.nextInt();
        input1.nextLine();

        if(people.containsKey(searchID)) {
            System.out.println(people.get(searchID));
        }
        else {
            System.out.println("Person with matching ID not found.");
        }

        while (input1.hasNext()) {
            input1.next();
        }

//        for (Person val: people.values()) {
//            if (val.name.equals(searchQuery));
//
//        }

        System.out.println("Enter an ID or Name: ");
        String searchID1 = input1.nextLine();
        input1.nextLine();

        Character c = new Character('a');

        if (Character.isDigit(searchID1.charAt(0))) {
            if(people.containsKey(searchID)) {
                System.out.println(people.get(searchID));
            }
            else {
                System.out.println("Person with matching ID not found.");
            }
        }
        else {
            for (Person val: people.values()) {
                if (val.name.equals(searchID));
            }
        }

        if(people.containsKey(searchID)) {
            System.out.println(people.get(searchID));
        }
        else {
            System.out.println("Person with matching ID not found.");
        }

        System.out.println("Enter an ID or Name: ");

        try {
            int searchID2 = input1.nextInt();
            input.nextLine();

            if(people.containsKey(searchID)) {
                System.out.println(people.get(searchID));
            }
            else {
                System.out.println("Person with matching ID not found.");
            }
        }
        catch (Exception e) {
            String searchName = input1.nextLine();

            for (Person val: people.values()) {
                if (val.name.equals(searchID)) {
                    System.out.println(val);
                };
            }
        }

// with finally
        /*
        try {
            int searchID2 = input1.nextInt();
            input.nextLine();

            if(people.containsKey(searchID)) {
                System.out.println(people.get(searchID));
            }
            else {
                System.out.println("Person with matching ID not found.");
            }
        }
        catch (InputMismatchException e) {
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        finally {
            String searchName = input1.nextLine();

            for (Person val: people.values()) {
                if (val.name.equals(searchID)) {
                    System.out.println(val);
                };
            }
        }
*/





    }


}
