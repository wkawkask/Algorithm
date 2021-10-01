package 과제4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class knight {
    
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int col;
            int row;
            int cnt =0;       

            String input = br.readLine();
            // 1부터 시작이니 더하기 1
            col = input.charAt(0) - 'a' + 1;
            row = input.charAt(1) - '1' + 1;

            int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
            int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

            //총 8칸
            for(int i=0; i<8; i++){
                int nr = row + dx[i];
                int nc = col + dy[i];

                if(nr >= 1 && nr <= 8 && nc >= 1 && nc <= 8 ){
                    cnt += 1;
                }
            }



            System.out.println(cnt);
            

            br.close();

  
        } catch (Exception e) {

        }

        

    }
}


