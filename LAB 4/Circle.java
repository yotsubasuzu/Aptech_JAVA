import java.util.*;

abstract class Shape {
    double radius;
    double  height;
    String color;

    abstract void getArea();

    Scanner input = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
}

class Circle extends Shape{
    void getRadius(){
        System.out.println("Enter Radius: ");
        radius = input.nextDouble();
        System.out.println("Radius = " + radius);
    }

    void getColor(){
        System.out.println("Enter Color: ");
        color = sc.nextLine();
        System.out.println("Color: " + color);
    }

    void getArea(){
        System.out.println("Area = " + (radius * radius * 3.1415));
    }
}

class Cylinder extends Circle{
    void getHeight(){
        System.out.println("Enter Height: ");
        height = input.nextDouble();
        System.out.println("Height = " + height);
    }

    // void getColor(){
    //     getColor();
    // }

    // void getArea(){
    //     System.out.println("Area = " + (radius * radius * 3.1415));
    // }

    void getVolume(){
        System.out.println("Volume = " + (radius*radius*3.1415* height));
    }


}