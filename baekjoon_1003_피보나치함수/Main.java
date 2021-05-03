package baekjoon_1003_피보나치함수;

import java.io.*;

// 14560KB	128MS
public class Main {
    static int T, N;
    static int[] ZERO, ONE;
    static String[] arr;

    public static void main(String[] args) throws IOException {

        ZERO = new int[41];
        ONE = new int[41];

        ZERO[0] = 1;
        ONE[0] = 0;
        ZERO[1] = 0;
        ONE[1] = 1;

        for (int i = 2; i <= 40; i++) {
            ZERO[i] = ZERO[i - 1] + ZERO[i - 2];
            ONE[i] = ONE[i - 1] + ONE[i - 2];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        arr = new String[T];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {

            N = Integer.parseInt(br.readLine());
            sb.append(ZERO[N]).append(" ").append(ONE[N]).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

}
