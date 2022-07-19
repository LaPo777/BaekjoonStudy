package silver.silver1;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());
        int result = 0;

        int size = Integer.parseInt(st1.nextToken());
        int testcase = Integer.parseInt(st1.nextToken());
        StringBuilder sb1 = new StringBuilder();

        int[][] arr = new int[size + 1][size + 1];




        for (int i = 1; i <= size; i++) {
            st1 = new StringTokenizer(bf1.readLine());
            for (int j = 1; j <= size; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }

        }
        int[][] d = new int[size + 1][size + 1];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                d[i][j] = d[i][j - 1] + d[i - 1][j] - d[i - 1][j - 1] + arr[i][j];

            }

        }
        for (int i = 1; i <= testcase; i++) {



            st1 = new StringTokenizer(bf1.readLine());
            int x1 = Integer.parseInt(st1.nextToken());
            int y1 = Integer.parseInt(st1.nextToken());
            int x2 = Integer.parseInt(st1.nextToken());
            int y2 = Integer.parseInt(st1.nextToken());


            result = d[x2][y2] - d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1];

            sb1.append(result + "\n");

        }
        System.out.println(sb1);


    }


}

