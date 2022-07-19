/**
* 작성일 2022-07-19
* queue 이용해서 푸는 문제
*
*
*
*
**/



package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf1.readLine());
        Queue queue = new LinkedList();
        StringBuilder sb1 = new StringBuilder();
        int cnt = 1;

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        for (int i = 1; i <= a; i++) {
            queue.add(i);

        }
        sb1.append("<");

        while(!queue.isEmpty()){
            if (!(cnt == b)){
                queue.add(queue.poll());
                cnt++;
            }else{
                sb1.append(queue.poll());
                cnt = 1;
                if(!queue.isEmpty()){
                    sb1.append(", ");
                }else {
                    sb1.append(">");
                }
            }

        }
        System.out.println(sb1);


    }
}
