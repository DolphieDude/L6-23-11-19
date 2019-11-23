package com.cherevatyi.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Felix"));
        cats.add(new Cat("Bazilik"));
        cats.add(new Cat("Richard"));
//        for (int i = 0; i < cats.size(); i++) {
//            if (cats.get(i).getName().equals("Bazilik")) {
//                cats.remove(i);
//            }
//        }
//        for (Cat c: cats) {
//            if (c.getName().equals("Bazilik")) {
//                cats.remove(c);
//            }
//        }
        Iterator<Cat> it = cats.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals("Bazilik")) {
                it.remove();
            }
        }
        System.out.println(cats.get(1).getName());
    }
}