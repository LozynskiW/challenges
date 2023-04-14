package pl.javabasics.streams;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {

        List<Integer> intList = Data.getUnsortedListOfIntegers();
        List<Integer> out;
        double val;
        // sort integers with values increasing
        out = intList.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(out);
        // leave only uneven numbers
        out = intList.stream().filter(e->e%2 != 0).collect(Collectors.toList());
        System.out.println(out);
        // leave only prime numbers
        out = intList.stream().filter(e -> ((e%2 != 0) && (e%3 != 0) && (e%5 != 0))).collect(Collectors.toList());
        System.out.println(out);
        // calculate mean
        val = intList.stream().reduce(Integer::sum).get().doubleValue()/ intList.size();
        System.out.println(val);
        // leave only values that are less than mean
        //out = intList.stream().

        List<String> stringList = Data.getUnsortedListOfStrings();
        List<String> stringOut;
        // sort strings alphabetically
        stringOut = stringList.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(stringOut);
        // leave only strings that consist of at least 2 a
        stringOut = stringList.stream().filter(s->s.matches("a{2}")).collect(Collectors.toList());
        System.out.println(stringOut);
        // leave only strings that start with m
        stringOut = stringList.stream().filter(s->s.matches("^m.")).collect(Collectors.toList());
        System.out.println(stringOut);
        // all strings to lowercase
        stringOut = stringList.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(stringOut);
        // change all 'a' to 'm'
        stringOut = stringList.stream().map(s -> s.replace('a', 'm')).collect(Collectors.toList());
        System.out.println(stringOut);
        // change to list of strings legnth
        intList = stringList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(intList);
        // leave only strings that have length greater or equal to 5
        stringOut = stringList.stream().filter(s->s.length()>=5).collect(Collectors.toList());
        System.out.println(stringOut);

        List<User> userList = Data.getUnsortedListOfUsers();
        List<User> userOut;
        // filter Users to leave only those older than 18
        userOut = userList.stream().filter(u->u.getAge() > 18).collect(Collectors.toList());
        System.out.println(userOut);
        // sort Users by name A->Z
        userOut = userList.stream().sorted(User::compareTo).collect(Collectors.toList());
        System.out.println(userOut);
        // leave only users that have name starting with M
        userOut = userList.stream().filter(u->u.getName().matches("^M.*")).collect(Collectors.toList());
        System.out.println(userOut);


    }
}
