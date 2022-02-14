package baekjoon_1032_명령프롬프트;

import java.io.*;
import java.util.*;

// 16216 KB 160 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String ans = "";
        ArrayList<String> target = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            target.add(br.readLine());
        }
        int fileNameLength = target.get(0).length();
        fileloop: for (int i = 0; i < fileNameLength; i++) {
            char targetA = target.get(0).charAt(i);
            for (int j = 1; j < N; j++) {
                if (target.get(j).charAt(i) != targetA) {
                    ans = ans + "?";
                    continue fileloop;
                }
            }
            ans = ans + targetA;
        }
        bw.write(ans);
        bw.flush();

        br.close();
        bw.close();

    }

}