package ru.stqa.pft.sandbox;

public class Rectangle {
    public double a, b,c;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c =c;

    }

    public double area() {
        return this.a * this.b;
    }
}
