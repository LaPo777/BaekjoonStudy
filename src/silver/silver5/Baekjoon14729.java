package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Baekjoon14729 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;


        int a = Integer.parseInt(bf1.readLine());

        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < a; i++) {
            st1 = new StringTokenizer(bf1.readLine());
            ll.add(Integer.valueOf(st1.nextToken()));
        }



        System.out.println(ll);



    }
}
