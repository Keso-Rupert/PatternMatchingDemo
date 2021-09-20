package dev.keso.typepattern;

import java.util.Objects;

public class TypePattern {

    public static void main(String[] args) {

        // What is pattern matching solving?
        Object obj = Integer.valueOf(10);

        if (obj instanceof Integer) {       // 1 test
            int intValue = (Integer) obj;   // 2 cast 3 local variable
            printInt(intValue);
        }

        // enter pattern matching: type pattern = type + pattern variable
        if (obj instanceof Integer i) { // performs all 3 steps above
            printInt(i);
        }
    }

    static void printInt(int i) {
        System.out.println("Here we have an integer: " + i);
    }
}

class User {
    String name;

    @Override
    public boolean equals(Object o){
//        return (o instanceof User) && (name.equals(((User) o).name));
        return (o instanceof User user) && name.equals(user.name);
    }
}