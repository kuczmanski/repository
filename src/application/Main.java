package application;

import java.util.Locale;
import java.util.Scanner;

import model.AbstractShape;
import model.Circle;
import model.Color;
import model.Rectangle;
import model.Terrain;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		//Scanner input = new Scanner(System.in);

		Double radius = 2.0;
		Double widthRectangle = 3.0;
		Double heightRectangle = 4.0;
		Double widthTerreno = 20.0;
		Double heightTerreno = 15.0;

		// System.out.println("Radius: ");
		// Double radius = input.nextDouble();
		// System.out.println("Width Rectangle: ");
		// Double widthRectangle = input.nextDouble();
		// System.out.println("Height Rectangle: ");
		// Double heightRectangle = input.nextDouble();
		// System.out.println("Width Terreno: ");
		//Double widthTerreno = input.nextDouble();
		// System.out.println("Height Terreno: ");
		//Double heightTerreno = input.nextDouble();
		
		AbstractShape circle = new Circle(Color.BLACK, radius);
		AbstractShape rectangle = new Rectangle(Color.WHITE, widthRectangle, heightRectangle);
		Terrain terreno = new Terrain(widthTerreno, heightTerreno);
		
		System.out.println("Circle color: " + circle.getColor());
		System.out.println("Circle area: " + String.format("%.2f", circle.area()));
		System.out.println("Rectangle color: " + rectangle.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", rectangle.area()));
		System.out.println("Terrain area: " + String.format("%.2f m²", terreno.area()));
	}
}