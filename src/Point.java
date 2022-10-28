/*
16. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.*/

public class Point {

    int x, y;

    Point() {
        System.out.println("No arg constructor");

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
        //return x;
    }

    public void setY(int y) {
        this.y = y;
        //return y;
    }
    public double distance() {

        return distance(0, 0);
    }

    public double distance(Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }


}
