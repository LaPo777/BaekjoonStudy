package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        int N = Integer.parseInt(bf1.readLine());

        while (end_index != N) {

            if (sum > N) {
                sum = sum - start_index;
                start_index++;

            } else if (sum < N) {
                end_index++;
                sum = sum + end_index;

            } else if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);

    }
}
