package com.cherevatyi;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        List someList = new ArrayList();
        someList.add("test");
        someList.add("test2");
        someList.remove(0);
        for (Object o: someList) System.out.println(o);
    }
}
