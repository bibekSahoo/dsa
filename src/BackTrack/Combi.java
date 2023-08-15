package BackTrack;

import java.util.Arrays;

public class Combi {
    public static void main(String[] args) {
//        print(0, 3, new int[3]);
        char[] chars = "bibekK".toCharArray();
//        HashMap<Character, Integer> keepCount = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            keepCount.put(chars[i], keepCount.getOrDefault(chars[i], 0) + 1);
//        }
//        for (Character character: keepCount.keySet()) {
//            System.out.println(character+" :  "+keepCount.get(character));
//        }
    }

    public static void print(int i, int n, int[] temp) {
        if (i == n) {
            System.out.println(Arrays.toString(temp));
            return;
        }
        temp[i] = 1;
        print(i + 1, n, temp);
        temp[i] = 2;
        print(i + 1, n, temp);
    }

}
