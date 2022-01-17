package baekjoon_4673_셀프넘버;

import java.io.*;
import java.util.*;

// 20688 KB 260 MS
public class Main {
    static HashSet<Integer> s;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = 1;
        s = new HashSet<>();
        while (target < 10000) {
            if (s.contains(target)) {
                target++;
                continue;
            }
            cal(target);

            bw.write(String.valueOf(target++) + "\n");
        }

        bw.flush();
        bw.close();

    }

    static void cal(int x) {
        while (x < 10000) {
            int temp = x;
            int length = (int) (Math.log10(temp) + 1);

            for (int i = 0; i < length; i++) {
                temp += x % 10;
                x = x / 10;
            }

            x = temp;
            s.add(x);

        }
    }
}