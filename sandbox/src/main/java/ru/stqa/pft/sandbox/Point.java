package ru.stqa.pft.sandbox;


public class Point {
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Point(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }


    public static void main(String[] args) {


        Point distance = new Point(5, 7, 6, 9);
        System.out.println("Distance between two points are " + distance.distance());


    }

    public double distance() {

        double ac = Math.abs(this.x1 - this.x2);
        double cb = Math.abs(this.y1 - this.y2);
        return Math.hypot(ac, cb);


    }


}




