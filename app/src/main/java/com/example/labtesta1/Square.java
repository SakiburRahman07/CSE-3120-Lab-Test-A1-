package com.example.labtesta1;

public class Square extends Shape{
    double sidelength;
    public Square(double sidelength) {
        super("Square");
        this.sidelength=sidelength;
    }

    public double area()
    {
        double ans = sidelength*sidelength;
        if(ans<0)
        {
            throw new IllegalArgumentException("Area can't be null");
        }
        return ans;
    }

    public double perimeter()
    {
        double ans = 4*sidelength;
        if(ans<0)
        {
            throw new IllegalArgumentException("Perimeter can't be null");
        }
        return ans;
    }
}
