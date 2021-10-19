package 과제6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static int N,M;
    public static int [][] graph = new int [200][200];
    //이동 4방향 상 , 하 , 좌 , 우
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // N, M 입력
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine(); //버퍼
        //행
        for(int i=0; i < N; i++){
            String str = scanner.nextLine();
            for(int j=0; j<M; j++){ //char ascii 코드값으로 값 빼서 나오게 하기.
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        scanner.close();

        System.out.println("result = " + bfs(0,0));

    }


    //bfs 탐색
    public static int bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(x,y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();
            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                //미로 범위를 벗어나면 무시
                if(nx <0 || ny < 0 || nx >= N || ny >= M) continue;
                //한 번 왔던 위치면 무시 , 괴물이 있는 위치면 무시
                if(graph[nx][ny]==1){
                graph[nx][ny] = graph[x][y] + 1;
                queue.add(new Node(nx, ny));
                }
            }
        }
            // 가장 오른쪽 아래까지의 최단 거리 반환
            return graph[N-1][M-1];

    }

    static class Node {
        private int x;
        private int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }

    }


}


