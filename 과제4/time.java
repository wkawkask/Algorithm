package 과제4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class time {
    
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N;
            // 합
            int cnt = 0;
            int time = 0;

            N = Integer.parseInt(br.readLine());

            
            time = N * 60 * 60;
            
            for(int i=0; i<=N; i++){
                for(int j=0; j < 60; j++){
                    for(int x=0; x < 60; x++){
                        if(i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || x / 10 == 3 || x % 10 == 3){
                            cnt += 1;
                        }
                    }
                }
            }

            
            System.out.println(cnt);
            

            br.close();

  
        } catch (Exception e) {

        }

        

    }
}


