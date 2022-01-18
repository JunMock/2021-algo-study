package baekjoon_1157_단어공부;

import java.io.*;
import java.util.*;

// 14308 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] target = br.readLine().split("");
        int size = target.length;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String t = target[i].toUpperCase();
            if (map.containsKey(t)) {
                map.replace(t, map.get(t) + 1);
            } else
                map.put(t, 1);
        }
        int max = 0;
        String word = "";
        for (Map.Entry<String, Integer> in : map.entrySet()) {
            int x = in.getValue();

            if (max < x) {
                max = x;
                word = in.getKey();
            }
        }

        for (Map.Entry<String, Integer> in : map.entrySet()) {
            int x = in.getValue();

            if (max == x && in.getKey() != word) {
                word = "?";
                break;
            }
        }

        bw.write(word);
        bw.flush();

        br.close();
        bw.close();

    }

}