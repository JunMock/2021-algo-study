package baekjoon_14681_사분면고르기;

import java.io.*;

// 14204 KB 132 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int a = 0;
        if (x > 0) {
            if (y < 0)
                a = 4;
            else
                a = 1;
        } else {
            if (y < 0)
                a = 3;
            else
                a = 2;
        }
        bw.write(Integer.toString(a));
        bw.flush();
        br.close();
        bw.close();
    }

}