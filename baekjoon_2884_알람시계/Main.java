package baekjoon_2884_알람시계;

import java.io.*;
import java.util.*;
//14240KB	124ms
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
            bw.write(sb.append(--H).append(" ").append(60 + M).toString());
        }
        else bw.write(sb.append(H).append(" ").append(M).toString());

        br.close();
        bw.flush();
        bw.close();
    }
}