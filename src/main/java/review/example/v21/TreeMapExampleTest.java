package review.example.v21;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExampleTest {

    @Test
    public void numOrdersEntriesNaturally() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        System.out.println(map.keySet());
    }

    @Test
    public void alphabetsOrdersEntriesNaturally() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("c", "val");
        map.put("b", "val");
        map.put("a", "val");
        map.put("e", "val");
        map.put("d", "val");

        System.out.println(map.keySet());
    }

    @Test
    public void ordersEntriesByComparator() {
        TreeMap<Integer, String> map =
                new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        System.out.println(map.keySet());
    }

    @Test
    public void queries() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        Integer highestKey = map.lastKey();
        Integer lowestKey = map.firstKey();
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();

        System.out.println("highestKey: " + highestKey);
        System.out.println("lowestKey: " + lowestKey);
        System.out.println("keysLessThan3: " + keysLessThan3);
        System.out.println("keysGreaterThanEqTo3: " + keysGreaterThanEqTo3);
    }

    @Test
    public void alphabetsQueries() {
        TreeMap<String, String> alMap = new TreeMap<>();
        alMap.put("c", "val");
        alMap.put("b", "val");
        alMap.put("a", "val");
        alMap.put("e", "val");
        alMap.put("d", "val");

        String highestKey = alMap.lastKey();
        String lowestKey = alMap.firstKey();
        Set<String> keysLessThan_d = alMap.headMap("d").keySet();
        Set<String> keysGreaterThanEqTo_b = alMap.tailMap("b").keySet();

        System.out.println("highestKey: " + highestKey);
        System.out.println("lowestKey: " + lowestKey);
        System.out.println("keysLessThan_d: " + keysLessThan_d);
        System.out.println("keysGreaterThanEqTo_b: " + keysGreaterThanEqTo_b);
    }
}
