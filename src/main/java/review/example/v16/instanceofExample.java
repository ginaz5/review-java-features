package review.example.v16;

import java.util.ArrayList;

public class instanceofExample {
    public static void main(String[] args) {
        Object obj = new ArrayList<>();

        if (obj instanceof ArrayList list) {
//            ArrayList l = (ArrayList) obj;
            list.add(10);
        }
        System.out.println(obj);
    }
}
