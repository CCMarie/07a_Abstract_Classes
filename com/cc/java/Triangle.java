package com.cc.java;

public  class Triangle extends Shape {


    private double basisline;
    private double height;






public  Triangle(double basisline, double height) {
    this.basisline = basisline;
    this.height = height;


}






    public void setHeight(double height) {
        this.height = height;
    }






@Override
    public double area() {
       
        return 2;



    }



}
