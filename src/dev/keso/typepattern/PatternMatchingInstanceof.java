package dev.keso.typepattern;

public class PatternMatchingInstanceof {

    public static void main(String[] args) {

        // What is pattern matching solving?
        Object obj = Integer.valueOf(10);

        if (obj instanceof Integer) {       // 1 We test if obj is an Integer
            int intValue = (Integer) obj;   // 2 If it is we cast the obj to an Integer and 3 extract a local variable
            printInt(intValue);             // Then we do something with that local variable
        }

        // How can we simplify this?
        // Enter pattern matching, with the type pattern = type + pattern variable
        if (obj instanceof Integer i) { // This performs all 3 steps above in one line
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
    public boolean equals(Object o) {
        return (o instanceof User) && (name.equals(((User) o).name)); // Look at the casting mess
    }

    // This is way cleaner!
/*    @Override
    public boolean equals(Object o){
        return (o instanceof User user) && name.equals(user.name);
    }*/
}