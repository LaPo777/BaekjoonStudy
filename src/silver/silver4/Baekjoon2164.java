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
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        Queue queue = new LinkedList();
        boolean flag = true;

        int a = Integer.parseInt(bf1.readLine());

        for (int i = 1; i <=  a; i++) {
            queue.add(i);

        }
        while(queue.size() != 1){

            if (flag){
                queue.poll();
                flag = false;
            }else {
                queue.add(queue.poll());
                flag = true;
            }
        }
        System.out.println(queue.poll());


    }
}
