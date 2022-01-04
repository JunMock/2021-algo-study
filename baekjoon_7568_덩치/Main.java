package baekjoon_7568_덩치;

import java.io.*;
import java.util.*;

// 15740 KB  140 MS
public class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int spell[][] = new int[num][2]; // 몸무게, 키
        int rank[] = new int[num]; // 순위

        StringTokenizer st = new StringTokenizer("");
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            rank[i] = 1;
            spell[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            spell[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (spell[i][0] > spell[j][0] && spell[i][1] > spell[j][1]) {
                    rank[j]++;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < num; i++) {
            bw.write(rank[i] + " ");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}