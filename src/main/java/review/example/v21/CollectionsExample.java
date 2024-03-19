package review.example.v21;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class CollectionsExample{
    public static void main(String[] args) throws Exception {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }

        System.out.println(map.pollLastEntry());

    }
}
