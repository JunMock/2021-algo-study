package baekjoon_1009_분산처리;

import java.io.*;
import java.util.*;

// 15664 KB 964 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer("");
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int target = 1;
            if (a == 1) {
                bw.write("1");
            } else if (a % 10 == 0) {
                bw.write("10");
            } else {
                for (int j = 0; j < b; j++) {
                    target = (target % 10) * a;

                    if (j == b - 1) {
                        bw.write(Integer.toString(target % 10));
                    }
                }
            }
            if (i != T - 1)
                bw.write("\n");
        }
        bw.flush();
    }

}