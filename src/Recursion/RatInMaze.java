package Recursion;

public class RatInMaze {

    boolean isSafe(int x, int y, int n, int[][] maze, int[][] visited) {
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && visited[x][y] == 0);
    }

    void solve(int x, int y, int n, int[][] maze, int [][] visited, String path, List<String> res){
        if(x == n-1 && y == n-1){
            res.add(path);
            return;
        }
        visited[x][y] = 1;

        // Down 
        if(isSafe(x+1, y, n, maze, visited)){
            solve(x+1, y, n, maze, visited, path + 'D', res);
        }

        // Right
        if(isSafe(x, y+1, n, maze, visited)){
            solve(x, y+1, n, maze, visited, path + 'R', res);
        }

        // Up
        if(isSafe(x-1, y, n, maze, visited)){
            solve(x-1, y, n, maze, visited, path + 'U', res);
        }

        // Left
        if(isSafe(x, y-1, n, maze, visited)){
            solve(x, y-1, n, maze, visited, path + 'L', res);
        }

        visited[x][y] = 0;
    }
    
}

// TC = O(4^(n^2))
// SC = O(n^2)
