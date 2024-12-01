package javabasic.oop;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rcetangle rcetangle = new Rcetangle();
        rcetangle.width =5;
        rcetangle.height =8;

        int area= rcetangle.calculateArea();
        System.out.println("넓이: "+area);
        int perimeter = rcetangle.calculatePerimeter();
        System.out.println("둘레 길이: "+perimeter);
        boolean square =rcetangle.isSquare();
        System.out.println("정사각형 여부: "+square);

    }
}
