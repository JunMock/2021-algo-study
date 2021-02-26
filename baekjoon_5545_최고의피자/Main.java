package baekjoon_5545_최고의피자;

import java.io.*;
import java.util.*;
// 
public class Main {
   
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            bw.write(arr[i], 0, arr[i].length());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    

}