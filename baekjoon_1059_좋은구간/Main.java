package baekjoon_1059_좋은구간;

import java.io.*;
import java.util.*;

// 14360 KB 124 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 정수집합 S A<B unsigned
        // 1 <= L <=50
        int L = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> ic = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        while (st.hasMoreTokens())
            ic.add(Integer.parseInt(st.nextToken()));
        Collections.sort(ic);

        int min = 0;
        int max = Integer.MAX_VALUE;
        // n in array
        if (ic.contains(n))
            bw.write("0");
        else {
            for (int x : ic) {
                if (x < n && x > min)
                    min = x;
                else if (x > n && x < max)
                    max = x;
            }
            int left = n - min - 1;
            int right = max - n - 1;
            bw.write(String.valueOf(left + right + (left * right)));
        }

        bw.flush();
        br.close();
        bw.close();

    }

}