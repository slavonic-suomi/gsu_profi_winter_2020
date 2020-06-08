package com.company.lesson20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionMain {

    @Table(name = "user_1_table")
    public static class User {
        public int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    @Example("some_val")
    @Table(name = "user_2_table", order = 12)
    public static class User2 extends User {
        public String email;
        private int someProperty;

        public void test1() {
            System.out.println("do test1");
        }

        public void test2(String param) {
            System.out.println("do test2" + param);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) throws Exception {
        Object object = new User2();

        Class<?> aClass = object.getClass();
        Class<User2> userClass = User2.class;

        Field[] fields = userClass.getFields();
        Arrays.stream(fields)
                .map(f -> f.getName())
                .forEach(System.out::println);

        System.out.println("========");
        Arrays.stream(userClass.getDeclaredFields())
                .map(f -> f.getName())
                .forEach(System.out::println);

        System.out.println("========");

        Arrays.stream(userClass.getSuperclass().getDeclaredFields())
                .map(f -> f.getName())
                .forEach(System.out::println);

        Field nameField = userClass.getDeclaredField("someProperty");
//        nameField.setAccessible(true);
        Object nameValue = nameField.get(object);

        System.out.println("========");
        System.out.println(nameValue);
        System.out.println("========");

        nameField.set(object, 12);
        System.out.println(((User2) object).someProperty);
        System.out.println("========");

        Method test1method = userClass.getMethod("test1");
        test1method.invoke(object);

        Method test2method = userClass.getMethod("test2", String.class);
        test2method.invoke(object, " hey");

        Constructor<User2> constructor = userClass.getConstructor();
        User2 user2 = constructor.newInstance();

        System.out.println(user2);
        System.out.println("========");


        Table tableAnnotation = userClass.getAnnotation(Table.class);
        System.out.println(tableAnnotation.name());

    }
}
