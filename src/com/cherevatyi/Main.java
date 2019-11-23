package com.cherevatyi;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> someList = new ArrayList<User>();
        for (int i = 1; i <= 10; i++) someList.add(new User("Andrii" + i, 15));
        User[] arr = new User[15];
        for (int i = 0; i < someList.size(); i++) arr[i] = someList.get(i);
        someList.remove(0);
        System.out.println("Check remove");
        System.out.println(someList.get(0));
        System.out.println("Check ArrayList");
        for (User u: someList) System.out.print(u + " ");
        System.out.println();
        System.out.println("Check Array");
        for (User u: arr) System.out.print(u + " ");
    }
}
