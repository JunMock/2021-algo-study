package baekjoon_2869_달팽이는올라가고싶다;

import java.io.*;
import java.util.*;

// 14524KB 132ms
public class Main {
    static int A, B, V, S;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        br.close();
        if ((V - B) % (A - B) != 0)
            S = (V - B) / (A - B) + 1;
        else
            S = (V - B) / (A - B);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(S));

        bw.flush();
        bw.close();
    }

}