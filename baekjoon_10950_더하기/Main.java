package baekjoon_10950_더하기;

import java.io.*;
import java.util.*;

// 14280 KB 132 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer("");
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.toString(Integer.parseInt(st.nextToken()) +
                    Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}