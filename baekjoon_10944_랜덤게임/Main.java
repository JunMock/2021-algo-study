package baekjoon_10944_랜덤게임;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        bw.write(sb.append((int) (Math.random() * 10000) + 1).toString());

        bw.flush();
        bw.close();
    }
}