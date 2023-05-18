public class C_Oppervlakte {

    public static void main(String[] args) {
        int answer = 0;


        answer = surfaceRectangle(2,8);
        System.out.println("The surface of a rectangle of a length of 8 and a width of 2 is " + answer);

        answer= surfaceSquare(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("The surface of a square with all 4 sides of 5 is " + answer);

        answer = surfaceBox(2,8,5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is " + answer);

        answer = surfaceCube(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteVierkant()` hergebruiken, of `oppervlakteDoos()` hergebruiken.
        System.out.println("De oppervlakte van een kubus met zijden van 5 cm is " + answer);
    }

public static int surfaceRectangle(int length, int width) {
    return length * width;
}
public static int surfaceSquare(int side){
        return side * side;
}
public static int surfaceBox(int length, int width, int height) {
        return length * width * height;
}
public static int surfaceCube(int side) {
    return side * side * side;
}
}
