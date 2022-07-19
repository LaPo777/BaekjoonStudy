package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());

        double d = ( a/(Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2))));
        int e = (int) (b*d);
        int f = (int) (c*d);

        System.out.println(e+" "+ f);

    }
}
