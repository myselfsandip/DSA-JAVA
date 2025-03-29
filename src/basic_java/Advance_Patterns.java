public class Advance_Patterns {
    public static void hollow_Rectangle_Pattern(int totalRows , int totalCols){
        //Rows
        for (int i=1 ; i<= totalRows;i++){
            //Columns
            for (int j=1 ; j<=totalCols;j++){
                //Cells (i,j)
                if(i==1 || j==1 || i==totalRows || j==totalCols){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
    }

    // Inverted AND Rotated half-pyramid
    public static void rotatedHalfPyramid(int n){
        //Rows
        for(int i=1;i<=n;i++){
            //Spaces
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted Half Pyramid with Numbers
    public static void inverted_half_pyramid_Numbers(int n){
        for (int i=1;i<=n;i++){
            for (int j=1 ;j <= (n-i)+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Floyd's Triangle
    public static void floydTriangle(int n){
        int counter = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }

    //0-1 Triangle
    public static void zero_One_Triangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((j+i) % 2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    //Butterfly Pattern
    public static void butterflyPattern(int n){
        //Butterfly - Upper Half
        for (int i=1 ; i<=n ;i++){
            //Stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*" + "\t");
            }
            //Spaces
            for (int j=1 ; j<= (n+n)-(i+i);j++){  //Logic 2 : Space = 2*(n-i)
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ;j<=i;j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

        //Butterfly - Lower Half
        for (int i=n ; i>=1 ;i--){
            //Stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*" + "\t");
            }
            //Spaces
            for (int j=1 ; j<= (n+n)-(i+i);j++){  //Logic 2 : Space = 2*(n-i)
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ;j<=i;j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

    }

    //SOLID RHOMBUS
    public static void rhombusPattern(int n){
        for (int i=1 ; i<= n ; i++){
            //Spaces
            for (int j = 1 ; j<= n-i;j++){
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ;j<=n ; j++){
                System.out.print("*" +"\t");
            }
            System.out.println();
        }
    }

    //HOLLOW RHOMBUS
    public static void hollowRhombus(int n){
        for (int i=1 ; i<=n ;i++){
            //Spaces
            for (int j=1;j<= n-i ; j++){
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ;j<=n ; j++){
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*" +"\t");
                }else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern
    public static void diamondPattern(int n){
        //Upper Half
        for (int i = 1; i <=n ; i++) {
            //Spaces
            for (int j=1 ; j<= n-i ;j++){
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ; j<=i+(i-1);j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        //Lower Half
        for (int i = n; i >= 1 ; i--) {
            //Spaces
            for (int j=1 ; j<= n-i ;j++){
                System.out.print(" " + "\t");
            }
            //Stars
            for (int j=1 ; j<=i+(i-1);j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //hollow_Rectangle_Pattern(4,5);
        //rotatedHalfPyramid(5);
        //inverted_half_pyramid_Numbers(30);
        //floydTriangle(5);
        //zero_One_Triangle(5);
        //butterflyPattern(5);
        //rhombusPattern(5);
        //hollowRhombus(5);
        diamondPattern(4);
    }
}
