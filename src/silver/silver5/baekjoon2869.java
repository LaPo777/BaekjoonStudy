package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int v = Integer.parseInt(st1.nextToken());



//        int cnt = 1;
//
//        while(true){
//            v -=  a;
//            if(v <= 0){
//                break;
//            }
//            v += b;
//
//            cnt++;
//
//
//        }
//        bw1.write(String.valueOf(cnt));
//
//        bw1.flush();
    }
}
