package backjoon_1181_단어정렬;

import java.io.*;
import java.util.*;
// 21408KB 344ms
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        br.close();

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(arr[0], 0, arr[0].length());
        bw.newLine();

        for (int i = 1; i < N; i++) {

            if (!arr[i].equals(arr[i - 1])) {
                bw.write(arr[i], 0, arr[i].length());
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

}