package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int sum = 0;


        int a = Integer.parseInt(bf1.readLine());

        int[] arr = new int[a];
        StringTokenizer st2 = new StringTokenizer(bf1.readLine());

        for (int i = 0; i <arr.length ; i++) {

            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for(int q: arr){
            if(max < q) max = q;
            sum += q;


        }



        double avg = (sum *100.0 / max / a);

        System.out.println(avg);



    }
}
