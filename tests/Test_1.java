package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_1{

	private String shape;

	public static void main(String[] args){
		ShapesModelTest t = new TriangleTest();
	}
}

abstract class ShapesModelTest extends Shape {
	private String shape;
	
	public ShapesModelTest(String shape, Color color){
		this.shape = shape;
		System.out.println(shape + color);
	}
}

class TriangleTest extends ShapesModelTest{
	
	public TriangleTest(Color color){
		super("Test_1");	
	}
}
