package inflearn;

public class Recursion_Maze {
    private static int N = 8;
    private static int [][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int PATHWAY_COLOUR = 0;
    private static final int WALL_COLOUR = 1;
    private static final int BLOCKED_COLOUR = 2;
    private static final int PATH_COLOUR = 3;

    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOUR)
            return false;
        else if (x==N-1 && y==N-1) {
            maze[x][y] = PATH_COLOUR;
            return true;
        }
        maze[x][y] = PATH_COLOUR;
        if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1))
            return true;
        maze[x][y] = BLOCKED_COLOUR; // dead end
        return false;
    }

    public static void main(String[] args) {
        boolean result = findMazePath(0, 0);
        System.out.println("result is " + result);
    }
}
