package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());

        int change = Integer.parseInt(st1.nextToken());
        int[] arr = new int[change];
        int max = 0;
        int min = 0;

        st1 = new StringTokenizer(bf1.readLine());
        for (int i = 0; i < change; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());

        }

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < min){
                min = arr[i];
            }
            if(arr[i]> max){
                max = arr[i];
            }

        }

        System.out.println(min + " " + max);
    }
}
