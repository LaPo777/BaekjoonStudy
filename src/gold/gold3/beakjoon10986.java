package gold.gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());

        int size = Integer.parseInt(st1.nextToken());
        int div = Integer.parseInt(st1.nextToken());
        long count = 0;
        long sum = 0;

        int[] arr = new int[size];
        st1 = new StringTokenizer(bf1.readLine());
        long[] multicount = new long[div];


        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(st1.nextToken());
            arr[i] = (int)(sum % div);
            if (arr[i] == 0) {
                count++;
            }
            multicount[arr[i]] += 1;
        }

        for (int i = 0; i < div; i++) {
            if (multicount[i] == 0) {
                continue;
            }

            count += (multicount[i] * (multicount[i] - 1) / 2);

        }
        System.out.println(count);


    }
}