package com.company.lesson19;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiMain {
    public static void main(String[] args) {
        List<User> userList = List.of(
                new User("user3", List.of(new Role("admin"), new Role("user"))),
                new User("user2", List.of(new Role("moderator"), new Role("user"))),
                new User("user1", List.of(new Role("user")))
        );

        String expectedRole = "user";

        List<User> matchingList = new ArrayList<>();
        for (User user : userList) {
            for (Role role : user.getRoles()) {
                if (role.getName().equals(expectedRole)) {
                    matchingList.add(user);
                    break;
                }
            }
        }

        System.out.println(matchingList);

        List<User> matchingList2 = userList.stream()
                .parallel()
                .filter(u -> u.getRoles().stream().anyMatch(r -> r.getName().equals(expectedRole)))
                .collect(Collectors.toList());

        System.out.println(matchingList2);

        Stream<User> userStream1 = userList.stream();
        Stream<User> userStream2 = userStream1.filter(user -> user.getRoles().size() > 1);
//        Stream<String> nameStream = userStream2.map(user -> user.getName());
        Stream<String> nameStream = userStream2.map(User::getName);
        Stream<String> sortedStream = nameStream.sorted();
        Stream<String> limitStream = sortedStream.limit(1);
//        Stream<String> peekStream = limitStream.peek(e -> System.out.println(e));
//        limitStream.forEach(e -> System.out.println(e));
        List<String> users5 = limitStream.collect(Collectors.toList());

        long count = userList.stream()
                .flatMap(user -> user.getRoles().stream())
                .map(role -> role.getName())
                .distinct()
                .count();

        DoubleSummaryStatistics statistics = DoubleStream.of(1, 2, 3, 4, 5, 6)
                .summaryStatistics();

        System.out.println(count);



    }
}
