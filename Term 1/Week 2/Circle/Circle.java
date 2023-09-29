import java.util.Scanner;

public class Circle {

    // fields
    private double radius;
    private String color;

    // default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // 2nd constructor with given radius, but colour default
    public Circle(double r){
        radius = r;
        color = "red";
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(double radius) {
    if (radius >= 0 && radius <= 5) {
        this.color = "red";
        }
    if (radius >= 6 && radius <= 10) {
        this.color = "amber";
        }
    if (radius >= 11 && radius <= 15) {
        this.color = "green";
        }
    if (radius >= 16 && radius <= 20) {
        this.color = "purple";
        }
    if (radius >= 21 && radius <= 25) {
            this.color = "black";
        }
    if (radius > 25) {
            this.color = "yellow";
        }
    }

}


