package _19_Graphs;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class _14_FloodFill { // This is Wrong

    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc-1, color, vis, orgCol);// Left
        helper(image, sr, sc+1, color, vis, orgCol);// right
        helper(image, sr-1, sc, color, vis, orgCol);// up
        helper(image, sr+1, sc, color, vis, orgCol);// down
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];  // image a nor mal array -> this just defines the size of the array
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {

    }
}
