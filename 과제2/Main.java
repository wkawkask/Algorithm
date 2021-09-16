package 과제2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Algorithm0
 */
public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N;
            // 합
            int total = 0;
            // 첫째 줄에 사람의 수 N(1 ≤ N ≤ 1,000)이 주어진다.

            N = Integer.parseInt(br.readLine());

            // 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어진다. (1 ≤ Pi ≤ 1,000)

            ArrayList<Integer> times = new ArrayList<Integer>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                times.add(Integer.parseInt(st.nextToken()));
            }

            // 정렬
            Collections.sort(times);

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < i; j++) {
                    total += times.get(j);
                }
            }

            br.close();

            System.out.println(total);
        } catch (Exception e) {

        }

    }

}
