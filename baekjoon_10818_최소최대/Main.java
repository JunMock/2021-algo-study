package baekjoon_10818_최소최대;

import java.io.*;
import java.util.*;

// 14308 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < T; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        bw.write(arr.get(0) + " " + arr.get(arr.size()-1));
        bw.flush();
        br.close();
        bw.close();

    }

}