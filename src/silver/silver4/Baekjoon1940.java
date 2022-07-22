package silver.silver4;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;

        int a = Integer.parseInt(bf1.readLine());
        int b = Integer.parseInt(bf1.readLine());
        int[] arr = new int[a];
        int cnt = 0;
        int sum = 0;
        int start_idx = 0;
        int end_idx = arr.length - 1;
        st1 = new StringTokenizer(bf1.readLine());
        for (int i = 0; i < a; i++) {

            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);

        while (start_idx < end_idx) {

            if (arr[start_idx] + arr[end_idx] > b) {
                end_idx--;
            } else if (arr[start_idx] + arr[end_idx] < b) {
                start_idx++;

            }else {
                start_idx++;
                cnt++;
            }

        }
        System.out.println(cnt);


    }
}
