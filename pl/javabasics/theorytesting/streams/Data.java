package pl.javabasics.theorytesting.streams;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Integer> getUnsortedListOfIntegers() {

        return List.of(1, 2, 3, 0, 6, 83, 18, 20, 10, 9, 45, 23, 21);
    }

    public static List<String> getUnsortedListOfStrings() {

        return List.of("jabłko", "kiwi", "gruszka", "pomarańcza", "ananas", "mandarynka", "truskawka", "grapefruit", "mango", "malina", "arbuz", "cytryna", "winogrono", "brzoskwinia", "śliwka", "banan", "melon", "figa", "granat", "limonka");
    }

    public static List<User> getUnsortedListOfUsers() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(25, "John"));
        userList.add(new User(32, "Alice"));
        userList.add(new User(18, "Bob"));
        userList.add(new User(40, "Mary"));
        userList.add(new User(27, "David"));
        userList.add(new User(21, "Emily"));
        userList.add(new User(36, "Jack"));
        userList.add(new User(29, "Olivia"));
        userList.add(new User(24, "Tom"));
        userList.add(new User(31, "Samantha"));

        return userList;
    }
}
