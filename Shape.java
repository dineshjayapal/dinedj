package com.basic;

public class Shape {
double side;
double length;
double breadth;
public Shape(double side)
{
	this.side=side;
}
public Shape(double length,double breadth)
{
	if(length>0.0&&length<20.0&&breadth>0.0&&breadth<20.0) {
		this.length=length;
		this.breadth=breadth;
	}else {
		System.out.println("it should be greater then 0.0 and less then 20.0");
	}
}
public double Rectangle() {
	return length*breadth;
}
public static void main(String args[])
{
 //Shape rect=new Shape();
	Shape rect=new Shape(9,2);
	System.out.println(rect.Rectangle());
  
}
}
