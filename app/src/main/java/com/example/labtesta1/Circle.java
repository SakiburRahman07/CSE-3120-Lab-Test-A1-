package com.example.labtesta1;

public class Circle extends Shape{

    double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius=radius;
    }

    public double area()
    {
        double ans = radius*radius*3.14;
        if(ans<0)
        {
            throw new IllegalArgumentException("Area can't be null");
        }
        return ans;
    }

    public double perimeter()
    {
        double ans = 2*3.14*radius;
        if(ans<0)
        {
            throw new IllegalArgumentException("Perimeter can't be null");
        }
        return ans;
    }

}
