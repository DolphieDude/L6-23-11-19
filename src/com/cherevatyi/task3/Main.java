package com.cherevatyi.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("Test");
        linked.addFirst("Hi");
        for (String s: linked) System.out.println(s);
        linked.remove(0);
        for (String s: linked) System.out.println(s);
    }
}
