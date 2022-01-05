package baekjoon_10952_더하기;

import java.io.*;
import java.util.*;

// 14284 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer("");
        int a = 0;
        int b = 0;
        while (true) {

            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0)
                break;
            bw.write(Integer.toString(a +
                    b) + "\n");
        }

        br.close();
        bw.close();

    }

}