package com.techlab.test;

import com.techlab.model.IShape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;
import com.techlab.model.YellowShapeDecorator;

public class DecoratorShapeTest {

	public static void main(String[] args) {
		IShape rect =  new Rectangle();
		IShape sq = new Square();
		IShape yellowRect = new YellowShapeDecorator(new Rectangle());
		IShape yellowSq = new YellowShapeDecorator(new Square());
		
		System.out.println("\nNormal Rectangle without border: ");
		rect.draw();
		
		System.out.println("\nNormal Square without border: ");
		sq.draw();
		
		System.out.println("\nNormal Rectangle with border: ");
		yellowRect.draw();
		
		System.out.println("\nNormal Square with border: ");
		yellowRect.draw();
	}

}
