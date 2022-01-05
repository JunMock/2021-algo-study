package baekjoon_2562_최댓값;

import java.io.*;
import java.util.*;

// 16128 KB 156 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
        Collections.sort(arr);

        int p = arr.get(arr.size() - 1);

        bw.write(Integer.toString(p) + "\n" + Integer.toString(arr2.indexOf(p) + 1));
        bw.flush();
        br.close();
        bw.close();

    }

}