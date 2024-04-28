package homework;

public class CubeAppl {
    public static void main(String[] args) {
        Cube[] cubes = {new Cube(3), new Cube(5), new Cube(7)};
        for (int i = 0; i < cubes.length; i++) {
            cubes[i].printInfo("Cube " + (i + 1));
        }
    }
}
