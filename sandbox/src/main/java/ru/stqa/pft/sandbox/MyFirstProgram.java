package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public MyFirstProgram() {
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 6);

        Square s = new Square(5);

        hello("world");

        System.out.println("The square of area with len " + s.l + " are " + s.area());

        System.out.println("The square of rectangle with len " + r.a + " and " + r.b + " are " + r.area());


    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody);
    }


}
