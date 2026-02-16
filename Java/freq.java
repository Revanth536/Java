package Java;

import java.util.HashMap;

public class freq {
    public static void main(String[] args) {
        String s = "hello world";
        String n = s.replaceAll(" ", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : n.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for (char c : map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }
    }
}
