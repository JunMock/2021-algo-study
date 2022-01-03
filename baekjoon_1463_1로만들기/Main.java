package baekjoon_1463_1로만들기;

import java.io.*;

// 14340KB 156MS
public class Main {

    static int A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        A = Integer.MAX_VALUE;
        int cnt = 0;

        Solution(X, cnt);

        bw.write(String.valueOf(A));
        bw.flush();
        bw.close();

    }

    public static void Solution(int x, int cnt) {
        if (cnt >= A)
            return;
        if (x == 1)
            A = cnt;
        else if (x == 2)
            A = cnt + 1;

        if (x % 3 == 0)
            Solution(x / 3, cnt + 1);
        if (x % 2 == 0)
            Solution(x / 2, cnt + 1);
        Solution(x - 1, cnt + 1);

    }

}