package baekjoon_2908_상수;

import java.io.*;

// 14160 KB 124 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] x = br.readLine().split(" ");

        for (int i = 0; i < 2; i++) {
            char temp = ' ';
            char[] cl = x[i].toCharArray();
            temp = cl[0];
            cl[0] = cl[2];
            cl[2] = temp;

            x[i] = String.copyValueOf(cl);
        }

        if (Integer.parseInt(x[0].toString()) > Integer.parseInt(x[1].toString()))
            bw.write(x[0]);
        else
            bw.write(x[1]);

        bw.flush();

        br.close();
        bw.close();

    }

}
