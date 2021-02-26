package baekjoon_5545_최고의피자;

import java.io.*;
import java.util.*;

// 14360KB 128ms
public class Main {
    static int N, A, B, C, S;
    static Integer[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        S = C / A;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        br.close();
        
        Solution();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(S));

        bw.flush();
        bw.close();
    }

    public static void Solution() {
        for (int i = 0; i < N; i++) {
            if (S <= (C + arr[i]) / (A + B)) {
                S = (C + arr[i]) / (A + B);
                C = C + arr[i];
                A = A + B;
            } else
                break;
        }

    }
}
