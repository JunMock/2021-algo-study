package baekjoon_1283_단축키지정;

import java.io.*;
import java.util.*;
// 16772KB 176ms
public class Main {
    static Boolean[] check;

    public static void main(String[] args) throws IOException {
        check = new Boolean[26];
        Arrays.fill(check, false);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = addBracket(br.readLine());
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

    public static String addBracket(String target) {

        String[] tempArray = target.split(" ");
        StringBuffer sb = new StringBuffer();
        boolean run = false;
        int key = 0;

        for (int i = 0; i < tempArray.length; i++) {

            key = createKey(tempArray[i].charAt(0));

            if (i != 0)
                sb.append(" ");

            if (check[key] == true || run == true) {
                sb.append(tempArray[i]);
                continue;
            }

            check[key] = true;
            run = true;
            sb.append("[" + tempArray[i].charAt(0) + "]" + tempArray[i].substring(1));
            
        }

        if (run) {
            return sb.toString();
        }

        sb = new StringBuffer(target);

        for (int index = 0; index < sb.length(); index++) {
            char temp = sb.charAt(index);
            if (temp == 32)
                continue;
            key = createKey(temp);

            if (check[key] == true)
                continue;

            check[key] = true;
            sb.insert(index, "[");
            sb.insert(index + 2, "]");
            return sb.toString();
        }

        return target;
    }

    public static int createKey(char input) {
        if (input < 'a')
            return input - 'A';
        else
            return input - 'a';
    }

}