package 과제5;

public class DFS {
    
    boolean[] visited = new boolean[9];
    int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

    public void dfs (int x){
        visited[x] = true;
        System.out.print(x + " ");

        for(int node : graph[x] ){
            if(!visited[node]){
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {

        try {
            

            new DFS().dfs(1);


  
        } catch (Exception e) {

        }

        

    }
}


