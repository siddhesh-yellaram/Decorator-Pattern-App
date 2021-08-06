package com.techlab.model;

public class YellowShapeDecorator extends ShapeDecorator{

	public YellowShapeDecorator(IShape newShape) {
		super(newShape);
	}
	
	@Override
	public void draw() {
		newShape.draw();
	}
	
	public void setNewBorder(IShape newShape) {
		System.out.println(newShape+" border color is yellow!!");
	}
}
