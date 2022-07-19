package silver.silver4;



import javax.swing.plaf.basic.BasicTreeUI;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf1.readLine());

        int[] arr = new int[a];
        int index = 0;

        while (a > 0) {
            st1 = new StringTokenizer(bf1.readLine());

            switch (st1.nextToken()) {
                case "push":
                    int c = Integer.parseInt(st1.nextToken());

                    arr[index++] = c;
                    a--;
                    break;


                case "top":
                    if (index > 0) {
                        bw1.write(String.valueOf(arr[index - 1]) + "\n");
                    } else {
                        bw1.write("-1\n");
                    }
                    a--;
                    break;


                case "pop":
                    if (index > 0) {
                        bw1.write(String.valueOf(arr[index - 1]) + "\n");
                        index--;
                    } else {
                        bw1.write("-1\n");
                    }
                    a--;
                    break;

                case "size":
                    bw1.write(String.valueOf(index) + "\n");
                    a--;
                    break;

                case "empty":
                    if (index > 0) {
                        bw1.write("0\n");
                    } else {
                        bw1.write("1\n");
                    }
                    a--;
                    break;
            }


        }
        bw1.flush();
    }

}


