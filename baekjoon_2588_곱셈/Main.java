package baekjoon_2588_곱셈;

import java.io.*;

// 14136KB 128ms
public class Main {
    static int F, S;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        F = Integer.parseInt(br.readLine());
        S = Integer.parseInt(br.readLine());

        for (int i = 1; i < 101; i = i * 10) {
            sb.append((S % (i * 10)) / i*F).append("\n");
        }

        bw.write(sb.append(F * S).append("\n").toString());

        br.close();
        bw.flush();
        bw.close();
    }
}