package com.example.labtesta1;

public class Triangle extends Shape{
    double a,b,c;
    public Triangle(double a, double b, double c) {
        super("Triangle");
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area()
    {
        double s =(a+b+c)/2;
        double ans = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        if(ans<0)
        {
            throw new IllegalArgumentException("Area can't be null");
        }
        return ans;
    }

    public double perimeter()
    {
        double ans = a+b+c;
        if(ans<0)
        {
            throw new IllegalArgumentException("Perimeter can't be null");
        }
        return ans;
    }
}
