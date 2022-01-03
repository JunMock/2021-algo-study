package baekjoon_1456_거의소수;

import java.io.*;
import java.util.*;

// 70308 KB 392 MS
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        boolean[] t = new boolean[10000001];
        ArrayList<Integer> tt = new ArrayList<>();
        ArrayList<Double> d = new ArrayList<>();

        for (int i = 2; i < 10000001; i++) {
            if (t[i]) {
                continue;
            }
            tt.add(i);
            for (int j = i + i; j < 10000001; j += i) {
                t[j] = true;
            }
        }

        for (Integer target : tt) {
            if (target >= b)
                break;
            for (double i = (double) target * target; i <= b; i *= target) {
                if (i >= a)
                    d.add(i);
            }
        }
        Collections.sort(d);
        bw.write(String.valueOf(d.size()));
        bw.close();
        br.close();
    }

}