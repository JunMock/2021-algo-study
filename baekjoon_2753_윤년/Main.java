package baekjoon_2753_윤년;

import java.io.*;

//14308KB	124ms
public class Main {
    static int Q;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        Q = Integer.parseInt(br.readLine());

        if (Q % 400 == 0)
            bw.write(sb.append(1).toString());
        else if ((Q % 4 == 0 && Q % 100 != 0))
            bw.write(sb.append(1).toString());
        else
            bw.write(sb.append(0).toString());

        br.close();
        bw.flush();
        bw.close();
    }
}