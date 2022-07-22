package silver.silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf1.readLine());

        LinkedList ll = new LinkedList();

        while(a > 0){
            st1 = new StringTokenizer(bf1.readLine());
            String b = st1.nextToken();

            switch (b){
                case "push":
                    int c = Integer.parseInt(st1.nextToken());
                    ll.add(c);
                    a--;
                    break;
                case "pop" :
                    if (ll.isEmpty()){
                        bw1.write("-1\n");

                    }else {
                        bw1.write(String.valueOf(ll.remove(0))+ "\n");
                    }
                    a--;
                    break;
                case "size":
                    bw1.write(String.valueOf(ll.size())+"\n");
                    a--;
                    break;
                case "empty" :
                    if (ll.isEmpty()){
                        bw1.write("1\n");
                    }else {
                        bw1.write("0\n");
                    }
                    a--;
                    break;
                case "front":
                    if (ll.isEmpty()){
                        bw1.write("-1\n");
                    }else {
                        bw1.write(String.valueOf(ll.getFirst())+"\n");
                    }
                    a--;
                    break;
                case "back":
                    if (ll.isEmpty()){
                        bw1.write("-1\n");
                    }else {
                        bw1.write(String.valueOf(ll.getLast())+"\n");
                    }
                    a--;
                    break;


            }

        }
        bw1.flush();
    }
}
