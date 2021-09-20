package dev.keso.typepattern;

public class TypePattern2 {

    public static void main(String[] args) {

        Object obj = Double.valueOf(10);

        // Things get more tricky when we take one value (obj)
        // and test it against more patterns:
        String formatted = "unknown";
        if (obj instanceof Integer) {
            int i = (Integer) obj;
            formatted = String.format("int %d", i);
        } else if (obj instanceof Byte) {
            byte b = (Byte) obj;
            formatted = String.format("byte %d", b);
        } else if (obj instanceof Long) {
            long l = (Long) obj;
            formatted = String.format("long %d", l);
        } else if (obj instanceof Double) {
            double d = (Double) obj;
            formatted = String.format("double %f", d);
        } else if (obj instanceof String) {
            String s = (String) obj;
            formatted = String.format("String %s", s);
        }
        //With the risk that formatted is "unknown", if for instance a Float object is used

        if (obj instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (obj instanceof Byte b) {
            formatted = String.format("byte %d", b);
        } else if (obj instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (obj instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (obj instanceof String s) {
            formatted = String.format("String %s", s);
        }

        System.out.println(formatted);

        switch(obj){
            case Integer i -> formatted = String.format("int %d", i);
            case Byte b -> formatted = String.format("byte %d", b);
            // etc
            default -> formatted = String.format("String %s", obj);
        }

    }
}
