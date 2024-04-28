package homework;

public class triangle {

    public static void main(String[] args) {

        double sideOfTriangle1 = 15.0;
        double sideOfTriangle2 = 20.3;
        double sideOfTriangle3 = 21.3;
        boolean aTriangle = aTriangle( sideOfTriangle1, sideOfTriangle2, sideOfTriangle3);

        if(aTriangle){

            System.out.println("Triangle exists ");
        }
        else{
            System.out.println("Triangle doesn't exist ");
        }
    }
    public static boolean  aTriangle (double sideOfTriangle1, double sideOfTriangle2,
                                      double sideOfTriangle3){
        return ((sideOfTriangle1 + sideOfTriangle2) > sideOfTriangle3 &&
                (sideOfTriangle1 + sideOfTriangle3) > sideOfTriangle2 &&
                (sideOfTriangle3 + sideOfTriangle2) > sideOfTriangle1);
    }
}