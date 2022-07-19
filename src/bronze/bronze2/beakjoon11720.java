package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int a = Integer.parseInt(bf1.readLine());
        char[] aa = bf1.readLine().toCharArray();

        for (int i = 0; i < a ; i++) {
            sum += Character.getNumericValue(aa[i]);

        }
        System.out.println(sum);

    }
}
