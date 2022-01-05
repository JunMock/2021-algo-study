package baekjoon_11022_더하기;

import java.io.*;
import java.util.*;

// 16488 KB 176 MS
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
            bw.write("Case #" + Integer.toString(i + 1) + ": " +
                    Integer.toString(a) +
                    " + " + Integer.toString(b) + " = " +
                    Integer.toString(a + b) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}