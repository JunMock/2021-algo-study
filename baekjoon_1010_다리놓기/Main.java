package baekjoon_1010_다리놓기;

import java.io.*;
import java.util.*;

// 15548 KB 168	 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Integer[] prime = primeNumberMaker(30);
        int primeLength = prime.length;
        StringTokenizer st = new StringTokenizer("");

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");

            // r
            int r = Integer.parseInt(st.nextToken());
            // n
            int n = Integer.parseInt(st.nextToken());

            int[] up = new int[n + 1];
            int[] down = new int[n + 1];

            // n! >> up
            for (int i = 1; i <= n; i++) {
                int target = i;

                for (int j = 0; j < primeLength; j++) {

                    if (target % prime[j] == 0) {
                        up[prime[j]]++;
                        target = target / prime[j];
                        j--;
                    }

                }
            }

            // (n-r)! >> down
            for (int i = 1; i <= n - r; i++) {
                int target = i;

                for (int j = 0; j < primeLength; j++) {

                    if (target % prime[j] == 0) {
                        down[prime[j]]++;
                        target = target / prime[j];
                        j--;
                    }

                }
            }

            // r!

            for (int i = 1; i <= r; i++) {
                int target = i;
                for (int j = 0; j < primeLength; j++) {

                    if (target % prime[j] == 0) {
                        down[prime[j]]++;
                        target = target / prime[j];
                        j--;
                    }

                }
            }

            int upX = 1;
            int downX = 1;
            // up / down
            for (int i = 1; i < n + 1; i++) {
                if (up[i] == down[i])
                    continue;
                else if (up[i] < down[i])

                    downX = (int) (downX * (Math.pow(i, (down[i] - up[i]))));
                else
                    upX = (int) (upX * (Math.pow(i, (up[i] - down[i]))));
            }

            bw.write(upX / downX + "\n");

        }
        bw.flush();
        br.close();
        bw.close();

    }

    static Integer[] primeNumberMaker(int N) {

        boolean[] prime = new boolean[N + 1];
        ArrayList<Integer> primeList = new ArrayList<>();

        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= N; i++) {

            if (!prime[i]) {
                for (int j = i * i; j <= N; j += i)
                    prime[j] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!prime[i])
                primeList.add(i);
        }

        return primeList.stream().toArray(Integer[]::new);
    }

}