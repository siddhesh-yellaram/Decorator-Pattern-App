package com.techlab.model;

public abstract class ShapeDecorator implements IShape{
	protected IShape newShape;

	public ShapeDecorator(IShape newShape) {
		this.newShape = newShape;
	}
	
	public void draw() {
		newShape.draw();
	}
}
