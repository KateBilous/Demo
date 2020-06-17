package ru.stqa.pft.sandbox;


public class Point {
    public double x1;
    public double y1;


    public Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;


    }


    public static void main(String[] args) {


        Point p1 = new Point(7, 5);
        Point p2 = new Point(7, -5);
        System.out.println("Distance between two points are " + p1.distance(p2));


    }

    public double distance(Point p2) {

        double ac = Math.abs(this.x1 - p2.x1);
        double cb = Math.abs(this.y1 - p2.y1);
        return Math.hypot(ac, cb);


    }


}




