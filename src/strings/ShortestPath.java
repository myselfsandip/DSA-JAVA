package strings;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("SHORTEST PATH: " + getShortestPath(str));
    }

    public static float getShortestPath(String path){
        int x=0,y=0 , n = path.length();
        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);
            if (dir == 'N'){  //N
                y++;
            } else if (dir == 'S') { //S
                y--;
            } else if (dir == 'E') { //E
                x++;
            } else if (dir == 'W') { //W
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+ Y2);
    }
}

//Time Complexity - BIg O of n
