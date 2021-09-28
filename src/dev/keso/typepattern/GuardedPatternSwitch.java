package dev.keso.typepattern;

public class GuardedPatternSwitch {

    public static void main(String[] args) {

        Object obj = Integer.valueOf(10);

        switch (obj) {
            case Integer i && (i > 5)-> System.out.println("It's a pretty big integer!");
            case Byte b -> System.out.println("Yup it's a byte");
            // etc
            default -> System.out.println("Who knows what it is");
        };

    }
}
