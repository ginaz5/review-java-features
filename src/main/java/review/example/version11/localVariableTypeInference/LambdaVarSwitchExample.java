package review.example.version11.localVariableTypeInference;


public class LambdaVarSwitchExample {
    public static void main(String[] args) {
        var month = 4;
        var season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> {
                String monthStr = switch (month)
                {
                    case 3 -> "March";
                    case 4 -> "April";
                    case 5 -> "May";
                    default -> "Unknown";
                };
                yield "Spring - " + monthStr;
            }
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        System.out.println("Month " + month + " is in " + season);

        // other switch cases
        var resInvalid = validSwitch(); // assign var value from switch
        System.out.println(resInvalid);
    }

    public static int validSwitch() {
        var month = "JANUARY";
        switch (month) {
            case "JANUARY", "JUNE", "JULY" -> { return 3; }
            default -> { return 0; }
        }
    }

//    public static int invalidSwitch() {
//        var month = "JANUARY";
//        var result = switch (month) {
//            case "JANUARY", "JUNE", "JULY" -> { return 3; }
//            default -> { return 0; }
//        };
//    }

}