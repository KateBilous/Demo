package ru.stqa.pft.sandbox;




    public class Point {
        public  double x1;
        public  double x2;
        public double y1;
        public double y2;

        public Point(){
            
        }



        public static void main(String[] args) {



        /*Point1 p1 = new Point1(9,9, null,null);
        Point1 p2 = new Point1(null,null,8,5);*/

            Point p1 =new Point();
            p1.x1= 9;
            p1.x2 =6;
            Point p2 = new Point();
            p2.y1 =-4;
            p2.y2 =0;

            System.out.println("Distance between two points are "+ distance(p1,p2));





        }   public static double distance(Point p1, Point p2){

            double ac = Math.abs(p1.x1 - p1.x2);
            double cb = Math.abs(p2.y1 - p2.y2);
            return Math.hypot(ac, cb) ;


        }











}




