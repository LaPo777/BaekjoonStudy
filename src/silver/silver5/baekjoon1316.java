package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (checkGroup(br.readLine())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean checkGroup(String str) {

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));

        int flag = 0;

        for (String s : set) {
            int idx1 = str.indexOf(s);
            int idx2 = str.lastIndexOf(s);

            if (idx1 != idx2) {
                for (int i = idx1 + 1; i < idx2; i++) {
                    if (!s.equals(String.valueOf(str.charAt(i)))) {
                        flag++;
                    }
                }
            }
        }
        return flag == 0;
    }
}