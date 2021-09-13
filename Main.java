import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Algorithm01
 */
public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N, K;
            // 카운트
            int cnt = 0;

            // 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            ArrayList<Integer> money = new ArrayList<Integer>();

            // 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에
            // Ai는 Ai-1의 배수)

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                money.add(Integer.parseInt(st.nextToken()));
            }

            for (int i = money.size(); i > 0; i--) {
                if (money.get(i - 1) > K) {
                    continue;
                }
                cnt += K / money.get(i - 1);
                K = K % money.get(i - 1);

                if (K == 0) {
                    break;
                }

            }
            br.close();

            System.out.println(cnt);
        } catch (Exception e) {

        }

    }

}
