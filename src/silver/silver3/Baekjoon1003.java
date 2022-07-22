package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1003 {
    static int a = 0;
    static int b = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));



        int chance = Integer.parseInt(bf1.readLine());

        while(chance-->0){
            int n = Integer.parseInt(bf1.readLine());
            fibo(n);
            bw1.write(String.valueOf(a) + " " + String.valueOf(b) + "\n");
            a =0;
            b =0;

        }
        bw1.flush();


    }
    public static int fibo(int n){
        if(n == 0){
            a++;
            return 0;
        }
        else if (n==1){
            b++;
            return 1;
        }else {
            return fibo(n-1) + fibo(n-2);
        }
    }

}
