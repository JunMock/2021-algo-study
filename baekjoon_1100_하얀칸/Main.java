package baekjoon_1100_하얀칸;

import java.io.*;

// 14224 KB 120 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String temp = br.readLine();
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1))
                    continue;

                if (temp.charAt(j) == 'F')
                    cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

        br.close();
        bw.close();

    }

}