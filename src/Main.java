import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        String a = "kaveridurga";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                int n = map.get(a.charAt(i)) + 1;
                map.put(a.charAt(i), n);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
