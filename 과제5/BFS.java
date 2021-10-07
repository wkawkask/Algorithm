package 과제5;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
    boolean[] visited = new boolean[9];
    int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

    public void bfs (int x){

        Queue<Integer> q = new LinkedList<>();

        q.offer(x);
        visited[x] = true;

        while(!q.isEmpty()){
            int n = q.poll();
            System.out.print(n + " ");

            for(int node : graph[n]){
                if(!visited[node]){
                    q.offer(node);
                    visited[node] = true;
                }
            }

        }
        

        
    }

    public static void main(String[] args) {

        try {
            

            new BFS().bfs(1);


  
        } catch (Exception e) {

        }

        

    }
}


