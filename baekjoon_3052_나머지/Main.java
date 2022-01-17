package baekjoon_3052_나머지;

import java.io.*;
import java.util.*;

// 14172 KB 124 MS
public class Main {
    static int target = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine()) % target;
            if (!map.containsKey(x))
                map.put(x, 1);
        }
        bw.write(String.valueOf(map.size()));
        bw.flush();

        br.close();
        bw.close();

    }

}