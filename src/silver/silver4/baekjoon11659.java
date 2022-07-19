package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());


        
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int[] arr = new int[a+1];

        st1 = new StringTokenizer(bf1.readLine());


        for (int i = 1; i < a+1; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            if(i != 1){
                arr[i] = arr[i]+arr[i-1];
            }


        }



        while(b-- > 0){
            st1 = new StringTokenizer(bf1.readLine());
            int c = Integer.parseInt(st1.nextToken());
            int d = Integer.parseInt(st1.nextToken());

            System.out.println(arr[d] - arr[c-1]);
        }
    }
}
