package baekjoon_8958_OX퀴즈;

import java.io.*;
import java.util.*;

// 14440 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String target = br.readLine();
            int total = 0;
            int inc = 1;
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) == 'O')
                    total += inc++;
                else
                    inc = 1;
            }
            bw.write(String.valueOf(total) + "\n");
        }
        bw.flush();

        br.close();
        bw.close();

    }

}