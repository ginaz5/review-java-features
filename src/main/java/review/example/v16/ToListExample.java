package review.example.v16;

import java.util.List;

public class ToListExample {
    public static void main(String[] args) {
        List<String> list = List.of("blog.didispace.com", "spring4all.com", "openwrite.cn", "www.didispace.com");

        List<String> result = list.stream()
                .filter(e -> e.contains("didispace.com"))
                .filter(e -> e.length() > 17)
                .toList();

        System.out.println(result);

        // difference
//        Stream.toList() -> Immutable
//        Collectors.toUnmodifiableList() -> Immutable
//        Collectors.toList() -> mutable
        // Performance
    }
}
