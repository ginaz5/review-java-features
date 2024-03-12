package review.example.v11.localVariableTypeInference;


import lombok.NonNull;
import java.util.List;


public class LambdaVarExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Java", "11");

        // Enhanced for-loop with lambda and `var`
        strings.forEach((@NonNull var s) -> System.out.println(s));
    }
}