package baekjoon_2884_알람시계;

import java.io.*;
import java.util.*;

// 14256KB 132ms
public class Main {
    static int H, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken()) - 45;

        if (M < 0) {
            if (H == 0)
                H = 24;
            H = H - 1;
            M = 60 + M;
        }

        bw.write(sb.append(H).append(" ").append(M).toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
