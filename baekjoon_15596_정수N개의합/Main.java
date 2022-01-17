package baekjoon_15596_정수N개의합;

import java.io.*;

// 422744 KB 24 MS
public class Main {
    public static void main(String[] args) throws IOException {
        Test t = new Test();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(t.sum(arr)));
        bw.flush();
        bw.close();
    }

}

class Test {
    public long sum(int[] a) {
        long total = 0;
        for (int x : a)
            total += x;

        return total;
    }
}