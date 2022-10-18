public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle tri1 = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        RightTriangle tri3 = new RightTriangle(2, 1);

        double hypotenuse1 = tri1.hypotenuse();
        double hypotenuse2 = tri2.hypotenuse();
        double hypotenuse3 = tri3.hypotenuse();

        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
        System.out.println(hypotenuse3);

    }
}
