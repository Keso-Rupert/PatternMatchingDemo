package dev.keso.typepattern;

public class PatternMatchingSwitch {

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

        // Using pattern matching with the instanceof operator, we can simplify this a lot
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
        // But formatted can still be unkown!
        System.out.println(formatted);

        // When there's a fixed amount of possibilities (including a default one), we use switch of course
        // Switch uses constant patterns: testing for equality against a constant:
        formatted = switch(obj){
            case Integer i -> String.format("int %d", i);
            case Byte b -> String.format("byte %d", b);
            // etc
            default -> String.format("String %s", obj);
        };
        System.out.println(formatted);

        // BTW, the previous example uses a switch EXPRESSION.
        // Using pattern matching in switch STATEMENTS is also possible:
        switch(obj) {
            case Integer i:
                formatted = String.format("int %d", i);
                break;
            case Byte b:
                formatted = String.format("byte %d", b);
                break;
            default:
                formatted = String.format("String %s", obj);
        }
        System.out.println(formatted);

    }
}
