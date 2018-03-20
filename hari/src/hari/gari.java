package hari;

public class gari {
	 public static void main(String s[])
	    {Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(25, 0);
        Point thirdPoint = new Point(0, 25);
        System.out.println("Given points form a right angled triangle : " + isARightAngledTriangle(firstPoint, secondPoint, thirdPoint));
 
    }
public static boolean isARightAngledTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
boolean isRightAngledTriangle = false;
double side1 = findSide(firstPoint,secondPoint);
double side2 = findSide(secondPoint,thirdPoint);
double side3 = findSide(thirdPoint,firstPoint);
 
if(Math.rint(side1*side1) == Math.rint(side2*side2 + side3*side3) || Math.rint(side2 * side2) == Math.rint(side3 *side3 + side1*side1)
|| Math.rint(side3*side3) == Math.rint(side1*side1 + side2*side2))
{
    isRightAngledTriangle = true;
}
return isRightAngledTriangle;
}
 
public static double findSide(Point p1,Point p2)
{
    double firstDiff = (p2.x - p1.x) *(p2.x - p1.x);
    double secondDiff = (p2.y - p1.y)*(p2.y - p1.y);
    double side = Math.sqrt(firstDiff + secondDiff);
    return side;
}
}
class Point {
 
double x;
double y;
 
Point(double x, double y) {
this.x = x;
this.y = y;
}
}