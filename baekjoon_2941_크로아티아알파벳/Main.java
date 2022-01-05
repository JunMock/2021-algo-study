package baekjoon_2941_크로아티아알파벳;

import java.io.*;

// 14308 KB 128 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        int cnt = 0;

        for (int i = 0; i < target.length(); i++) {
            char t = target.charAt(i);

            if (i + 1 < target.length()) {
                char nt = target.charAt(i + 1);
                switch (t) {
                    case 'c':
                        if (nt == '=' || nt == '-') {
                            i++;
                        }
                        break;
                    case 'd':
                        if (nt == '-') {
                            i++;
                        } else if (i + 2 < target.length()) {
                            if (nt == 'z' && target.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                        break;
                    case 'l':
                        if (nt == 'j') {
                            i++;
                        }
                        break;
                    case 'n':
                        if (nt == 'j') {
                            i++;
                        }
                        break;
                    case 's':
                        if (nt == '=') {
                            i++;
                        }
                        break;
                    case 'z':
                        if (nt == '=') {
                            i++;
                        }
                        break;
                }
            }
            cnt++;
        }

        bw.write(Integer.toString(cnt));

        br.close();
        bw.close();

    }

}