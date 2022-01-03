package baekjoon_1002_터렛;

import java.io.*;
import java.util.*;

// 14308KB 124ms
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[][] data = new int[2][3];
        ;

        for (int i = 0; i < T; i++) {
            data = new int[2][3];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            int k = 0;
            while (st.hasMoreTokens()) {

                data[j][k++] = Integer.parseInt(st.nextToken());
                if (k % 3 == 0) {
                    j++;
                    k = 0;
                }

            }
            double d = Math.sqrt(Math.pow((data[0][0] - data[1][0]), 2) + Math.pow((data[0][1] - data[1][1]), 2));
            if (data[0][2] + data[1][2] < d)
                bw.write("0\n");
            else if (Math.abs(data[0][2] - data[1][2]) > d)
                bw.write("0\n");
            else if (data[0][2] == data[1][2] && d == 0)
                bw.write("-1\n");
            else if ((data[0][2] + data[1][2]) == d)
                bw.write("1\n");
            else if (d == Math.abs(data[0][2] - data[1][2]))
                bw.write("1\n");
            else
                bw.write("2\n");

        }
        bw.flush();
        bw.close();
    }

}
