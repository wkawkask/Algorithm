package 과제4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class move {
    
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N;
            
            //처음위치
            int x = 1 , y = 1;

            int[] dx = {0, 0, -1 , 1};
            int[] dy = {-1, 1, 0 , 0};
            String[] move_type = {"L","R","U","D"};

            N = Integer.parseInt(br.readLine());
            
            ArrayList<String> move = new ArrayList<String>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                move.add(st.nextToken());
            }

            for(int i=0; i<move.size(); i++){
                int nx=0 , ny=0;
                for(int j=0; j<move_type.length; j++){
                    if(move_type[j].equals(move.get(i))){
                        nx = x + dx[j];
                        ny = y + dy[j];
                    }
                }

                if(nx < 1 || ny < 1 || nx > N  || ny > N ){
                    continue;
                }

                x = nx;
                y = ny;

            }

            
            System.out.println(x +" "+ y);
            

            br.close();

  
        } catch (Exception e) {

        }

        

    }
}


