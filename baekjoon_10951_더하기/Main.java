package baekjoon_10951_더하기;

import java.io.*;
import java.util.*;

// 14312 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String target = "";
        StringTokenizer st = new StringTokenizer("");
        while ((target = br.readLine()) != null) {

            st = new StringTokenizer(target, " ");
            bw.write(Integer.toString(Integer.parseInt(st.nextToken()) +
                    Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
        bw.close();

    }

}