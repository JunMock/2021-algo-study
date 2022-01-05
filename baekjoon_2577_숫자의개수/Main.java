package baekjoon_2577_숫자의개수;

import java.io.*;
import java.util.*;

// 14236 KB 124 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) {
            target *= Integer.parseInt(br.readLine());
        }
        String s = Integer.toString(target);
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(Integer.toString(arr[i]) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }

}