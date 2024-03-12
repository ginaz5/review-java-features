package review.example.v12;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.Optional;

public class StringApiExample {

    public static void main(String[] args) {

        // describeConstable method returns Optional instance of an calling object.
        Optional<String> s = Objects.requireNonNull(getStringOrNull()).describeConstable();
        Optional<Double> f = Objects.requireNonNull(getFloat()).describeConstable();

        System.out.println(s.get());
        System.out.println(f.get());

        String str = " Hello world ";
        String result= str.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(result);
    }
    private static Double getFloat() {
        return 3.1415926;
    }


    private static String getStringOrNull() {

        long time = System.currentTimeMillis();
        System.out.println("current time:" + time);
        if (time % 2 == 0) {
            return "2";
        }
        return "1";
    }
}
