package review.example.v14;

public class SwitchYieldExample {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        testYield();
    }

    public static void testYield() {
        // Example: Change this to test different cases
        DayOfWeek dayOfWeek = DayOfWeek.THURSDAY;

        int dayType = switch (dayOfWeek) {
            // Java 21
//            case null -> {
//                System.out.println("Null case");
//                yield 0;
//            }
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("It's a weekday");
                yield 1;
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("It's the weekend");
                yield 2; // "2" string is invalid here
            }
            default -> {
                System.out.println("Invalid day");
                yield -1;
            }
        };

        System.out.println("Day type code: " + dayType);
    }

    /* Limitation
    1. Version: Java >= 14
    2. Scope: yield can only be used within the context of a switch expression
    3. Relation with "return": return will interrupt the current method,
       but yield interrupt the switch only, the rest of code within the method will continue
    4. Good habit: Fully cover all possible values, especially when dealing with enums or sealed classes/interfaces.
    */
}

